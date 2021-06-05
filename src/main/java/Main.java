import parser.JacksonParser;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        JacksonParser.parseJson("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json");
    }
}
