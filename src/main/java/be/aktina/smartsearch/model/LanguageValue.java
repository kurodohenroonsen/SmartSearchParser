package be.aktina.smartsearch.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LanguageValue {
    private String value;
    private String language;

    @JsonProperty("@value")
    public String getValue() {
        return value;
    }

    @JsonProperty("@value")
    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("@language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("@language")
    public void setLanguage(String language) {
        this.language = language;
    }
}
