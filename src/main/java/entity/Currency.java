package entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class Currency {

    @JsonProperty("r030")
    int code;

    @JsonProperty("txt")
    String name;

    @JsonProperty("rate")
    BigDecimal rate;

    @JsonProperty("cc")
    String abbr;

    @JsonProperty("exchangedate")
    String exchangeDate;

    public Currency() {
    }

    public Currency(int code, String name, BigDecimal rate, String abbr, String exchangeDate) {
        this.code = code;
        this.name = name;
        this.rate = rate;
        this.abbr = abbr;
        this.exchangeDate = exchangeDate;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", rate=" + rate +
                ", abbr='" + abbr + '\'' +
                ", exchangeDate='" + exchangeDate + '\'' +
                '}';
    }
}
