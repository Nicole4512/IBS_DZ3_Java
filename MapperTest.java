package IBS_DZ3;


import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.FileInputStream;
import java.io.IOException;


interface MapperTest {

    static <T> T parseJsonFile(String fileName, Class<T> Tclass){
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            return (T) objectMapper.readValue(new FileInputStream(fileName), Tclass);
        } catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
}
