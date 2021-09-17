package DZ3;

public class Json_Use {
    public static void main(String[] args) {
        //Файл находится в resources

        String fileName = "/file.json";

        MapperTest.parseJsonFile(fileName, Company.class);
    }
}
