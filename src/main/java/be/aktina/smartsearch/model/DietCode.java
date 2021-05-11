package be.aktina.smartsearch.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DietCode {
    private SimpleCode dietType;
    private LanguageValue[] dietTypeSubcode;
    private String type;

    @JsonProperty("dietType")
    public SimpleCode getDietType() {
        return dietType;
    }

    @JsonProperty("dietType")
    public void setDietType(SimpleCode dietType) {
        this.dietType = dietType;
    }

    @JsonProperty("dietTypeSubcode")
    public LanguageValue[] getDietTypeSubcode() {
        return dietTypeSubcode;
    }

    @JsonProperty("dietTypeSubcode")
    public void setDietTypeSubcode(LanguageValue[] dietTypeSubcode) {
        this.dietTypeSubcode = dietTypeSubcode;
    }

    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(String type) {
        this.type = type;
    }
}