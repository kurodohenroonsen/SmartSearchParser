package be.aktina.smartsearch.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConsumerHandlingStorage {
    private SimpleCode surl;
    private String[] type;

    @JsonProperty("s:url")
    public SimpleCode getSurl() {
        return surl;
    }

    @JsonProperty("s:url")
    public void setSurl(SimpleCode surl) {
        this.surl = surl;
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
