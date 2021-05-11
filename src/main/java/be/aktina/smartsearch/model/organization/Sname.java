package be.aktina.smartsearch.model.organization;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sname {
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
