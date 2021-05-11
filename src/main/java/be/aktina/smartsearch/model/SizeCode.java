package be.aktina.smartsearch.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SizeCode {
    private String sizeCodeListCode;
    private String sizeCodeValue;
    private String type;

    @JsonProperty("sizeCodeListCode")
    public String getSizeCodeListCode() {
        return sizeCodeListCode;
    }

    @JsonProperty("sizeCodeListCode")
    public void setSizeCodeListCode(String sizeCodeListCode) {
        this.sizeCodeListCode = sizeCodeListCode;
    }

    @JsonProperty("sizeCodeValue")
    public String getSizeCodeValue() {
        return sizeCodeValue;
    }

    @JsonProperty("sizeCodeValue")
    public void setSizeCodeValue(String sizeCodeValue) {
        this.sizeCodeValue = sizeCodeValue;
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