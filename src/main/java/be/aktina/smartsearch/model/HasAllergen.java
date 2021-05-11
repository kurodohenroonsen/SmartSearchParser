package be.aktina.smartsearch.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HasAllergen {
    private SimpleCode allergenLevelOfContainmentCode;
    private SimpleCode allergenType;
    private String type;

    @JsonProperty("allergenLevelOfContainmentCode")
    public SimpleCode getAllergenLevelOfContainmentCode() {
        return allergenLevelOfContainmentCode;
    }

    @JsonProperty("allergenLevelOfContainmentCode")
    public void setAllergenLevelOfContainmentCode(SimpleCode allergenLevelOfContainmentCode) {
        this.allergenLevelOfContainmentCode = allergenLevelOfContainmentCode;
    }

    @JsonProperty("allergenType")
    public SimpleCode getAllergenType() {
        return allergenType;
    }

    @JsonProperty("allergenType")
    public void setAllergenType(SimpleCode allergenType) {
        this.allergenType = allergenType;
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