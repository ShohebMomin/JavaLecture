package day44;
import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadJson {
    static void main() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<Food> food = null;
        try {
            food = mapper.readValue(
                    new File("src/day44/food.json"),
                    new TypeReference<List<Food>>() {
                    }
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Food f : food)
            System.out.println(f);
    }
}
