package IBS_DZ3;

import com.fasterxml.jackson.databind.*;
import org.springframework.core.io.*;
import java.io.*;




interface MapperTest {

    static <T> T parseJsonFile(String fileName, Class<T> Tclass){
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            return (T) objectMapper.readValue(new ClassPathResource(fileName).getInputStream(), Tclass);
        } catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
}
