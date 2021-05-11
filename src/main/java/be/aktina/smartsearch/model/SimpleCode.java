package be.aktina.smartsearch.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SimpleCode {
    private String id;

    @JsonProperty("@id")
    public String getId() {
        return id;
    }

    @JsonProperty("@id")
    public void setId(String id) {
        this.id = id;
    }
}