package IBS_DZ3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Company {
    String name, address, phNumber;
    int INN, id;
    Date OGRN;
    List <Securities> securities = new ArrayList();


    @Override
    public String toString() {
        return "Имя: " + name + "Адрес:  " + address + "Номер телефона: " + phNumber + "ОГРН: " + OGRN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhNumber(String phNumber) {
        this.phNumber = phNumber;
    }

    public void setINN(int INN) {
        this.INN = INN;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOGRN(Date OGRN) {
        this.OGRN = OGRN;
    }

    public void setSecurities(List<Securities> securities) {
        this.securities = securities;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhNumber() {
        return phNumber;
    }

    public int getINN() {
        return INN;
    }

    public int getId() {
        return id;
    }

    public Date getOGRN() {
        return OGRN;
    }

    public List<Securities> getSecurities() {
        return securities;
    }




}

