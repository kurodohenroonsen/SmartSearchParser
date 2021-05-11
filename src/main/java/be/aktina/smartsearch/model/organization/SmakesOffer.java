package be.aktina.smartsearch.model.organization;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SmakesOffer {
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
