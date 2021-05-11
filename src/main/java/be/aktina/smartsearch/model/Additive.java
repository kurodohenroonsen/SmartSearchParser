package be.aktina.smartsearch.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Additive {
    private SimpleCode additiveLevelOfContainment;
    private LanguageValue[] additiveName;
    private String type;

    @JsonProperty("additiveLevelOfContainment")
    public SimpleCode getAdditiveLevelOfContainment() {
        return additiveLevelOfContainment;
    }

    @JsonProperty("additiveLevelOfContainment")
    public void setAdditiveLevelOfContainment(SimpleCode additiveLevelOfContainment) {
        this.additiveLevelOfContainment = additiveLevelOfContainment;
    }

    @JsonProperty("additiveName")
    public LanguageValue[] getAdditiveName() {
        return additiveName;
    }

    @JsonProperty("additiveName")
    public void setAdditiveName(LanguageValue[] additiveName) {
        this.additiveName = additiveName;
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
