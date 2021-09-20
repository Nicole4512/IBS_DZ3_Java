package IBS_DZ3;

import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Json_Use implements MapperTest{
    public static void showCompanyNameAndDate(ListCompany list) {
        list.getCompaniesList()
                .forEach(company -> System.out.println("Компания: " + company.getName() + "| дата основания: "
                        + LocalDate.ofInstant(company.getFounded().toInstant(), ZoneId.systemDefault())));
    }
    public static void showAllSecurities(ListCompany list){
        int count = 0;
        List<Company> companiesList = list.getCompaniesList();
        for (Company company : companiesList) {
            List<Securities> securitiesList = company.getSecurities();
            for(Securities s :securitiesList){
                if(java.time.LocalDateTime.now().isAfter(ChronoLocalDateTime.from(LocalDateTime.ofInstant(s.date.toInstant(), ZoneId.systemDefault())))){
                    System.out.println("Код: " + s.code + "|| Дата истечения: "+ LocalDate.ofInstant(s.date.toInstant(), ZoneId.systemDefault()) + "|| Название организации-владельца: "+s.name);
                    count++;
                }
            }
        }
        System.out.println("Количество просроченных ценных бумаг = " + count);
    }
    public static Date tryParse(String dateString)
    {
        List<String> formatStrings = Arrays.asList("dd.MM.yyyy", "dd.MM,yy", "dd/MM/yy", "dd/MM/yyyy");
        for (String formatString : formatStrings)
        {
            try
            {
                return new SimpleDateFormat(formatString).parse(dateString);
            }
            catch (java.text.ParseException e) {}
        }

        return null;
    }

    public static void showCompanyByDate(ListCompany list) {
        Date d = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Пожалуйста, ведите дату");
            String line = reader.readLine();
            d = tryParse(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
        LocalDateTime localDateTime = d.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        List<Company> companiesList = list.getCompaniesList();
        for (Company c : companiesList){
            if (localDateTime.isBefore(ChronoLocalDateTime.from(LocalDateTime.ofInstant(c.getFounded().toInstant(), ZoneId.systemDefault())))){
                System.out.println("Название: "+c.getName() + "  Дата основания: " + LocalDate.ofInstant(c.getFounded().toInstant(), ZoneId.systemDefault()));
            }
        }
    }

    public static void showCompaniesByCurrency(ListCompany list) {
        List<Company> companiesList = list.getCompaniesList();
        List<Securities> securitiesList;
        List<String> currencyList;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Пожалуйста, ведите код валюты");
            String line = reader.readLine();
            for (Company company : companiesList) {
                securitiesList = company.getSecurities();

                for (Securities s : securitiesList) {
                    currencyList = s.getCurrencyList();

                    for (String currency : currencyList){
                        if (currency.equals(line)){
                            System.out.println("id компании: " + company.getId() + " Код ценных бумаг: " + s.code);
                        }
                    }

                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        public static void main(String[] args) {
        String fileName = "C:/Users/Николь/IdeaProjects/Dz1/src/IBS_DZ3/file.json";
        ListCompany lc = MapperTest.parseJsonFile (fileName, ListCompany.class);
        //showCompanyNameAndDate(lc);
        //showAllSecurities(lc);
        // showCompanyByDate(lc) ;
        showCompaniesByCurrency(lc);
    }
}

