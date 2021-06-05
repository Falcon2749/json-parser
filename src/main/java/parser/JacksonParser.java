package parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import entity.Currency;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class JacksonParser {
    public static void parseJson(String url) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Currency[] currency = objectMapper.readValue(new URL(url), Currency[].class);

        for (Currency temp : currency) {
            System.out.println(temp.toString());
        }

        String jsonString = objectMapper.writerWithDefaultPrettyPrinter()
                                        .writeValueAsString(currency);

        Files.write(Paths.get("src/main/resources/Exchange Rate.json"),
                                    jsonString.getBytes(), StandardOpenOption.CREATE);
    }

}
