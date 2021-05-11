package be.aktina.smartsearch.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Size {
    private SimpleCode sizeSystem;
    private SimpleCode sizeType;
    private SimpleCode sizeGroup;
    private Mesure sizeDimension;
    private String type;

    @JsonProperty("sizeSystem")
    public SimpleCode getSizeSystem() {
        return sizeSystem;
    }

    @JsonProperty("sizeSystem")
    public void setSizeSystem(SimpleCode sizeSystem) {
        this.sizeSystem = sizeSystem;
    }

    @JsonProperty("sizeType")
    public SimpleCode getSizeType() {
        return sizeType;
    }

    @JsonProperty("sizeType")
    public void setSizeType(SimpleCode sizeType) {
        this.sizeType = sizeType;
    }

    @JsonProperty("sizeGroup")
    public SimpleCode getSizeGroup() {
        return sizeGroup;
    }

    @JsonProperty("sizeGroup")
    public void setSizeGroup(SimpleCode sizeGroup) {
        this.sizeGroup = sizeGroup;
    }

    @JsonProperty("sizeDimension")
    public Mesure getSizeDimension() {
        return sizeDimension;
    }

    @JsonProperty("sizeDimension")
    public void setSizeDimension(Mesure sizeDimension) {
        this.sizeDimension = sizeDimension;
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