package be.aktina.smartsearch.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Mesure {
    private SchemaSValue svalue;
    private String sunitCode;
    private String[] type;

    @JsonProperty("s:value")
    public SchemaSValue getSvalue() {
        return svalue;
    }

    @JsonProperty("s:value")
    public void setSvalue(SchemaSValue svalue) {
        this.svalue = svalue;
    }

    @JsonProperty("s:unitCode")
    public String getSunitCode() {
        return sunitCode;
    }

    @JsonProperty("s:unitCode")
    public void setSunitCode(String sunitCode) {
        this.sunitCode = sunitCode;
    }

    @JsonProperty("@type")
    public String[] getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(String[] type) {
        this.type = type;
    }
}