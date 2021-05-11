package be.aktina.smartsearch.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class ConvenienceLevelPercent {
    private String value;
    @JsonInclude(Include.NON_NULL)
    private String type;

    @JsonProperty("@value")
    public String getValue() {
        return value;
    }

    @JsonProperty("@value")
    public void setValue(String value) {
        this.value = value;
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