package be.aktina.smartsearch.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ColourCode {
    private String colourCodeValue;
    private SimpleCode[] colourCodeList;
    private String type;

    @JsonProperty("colourCodeValue")
    public String getColourCodeValue() {
        return colourCodeValue;
    }

    @JsonProperty("colourCodeValue")
    public void setColourCodeValue(String colourCodeValue) {
        this.colourCodeValue = colourCodeValue;
    }

    @JsonProperty("colourCodeList")
    public SimpleCode[] getColourCodeList() {
        return colourCodeList;
    }

    @JsonProperty("colourCodeList")
    public void setColourCodeList(SimpleCode[] colourCodeList) {
        this.colourCodeList = colourCodeList;
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