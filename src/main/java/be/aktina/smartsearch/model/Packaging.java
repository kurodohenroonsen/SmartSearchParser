package be.aktina.smartsearch.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Packaging {
    private SimpleCode packagingShape;
    private SimpleCode[] packagingRecyclingScheme;
    private SimpleCode[] packagingRecyclingProcessType;
    private SimpleCode[] packagingFunction;
    private SimpleCode[] packagingFeature;
    private String packagingType;
    private String type;

    @JsonProperty("packagingShape")
    public SimpleCode getPackagingShape() {
        return packagingShape;
    }

    @JsonProperty("packagingShape")
    public void setPackagingShape(SimpleCode packagingShape) {
        this.packagingShape = packagingShape;
    }

    @JsonProperty("packagingRecyclingScheme")
    public SimpleCode[] getPackagingRecyclingScheme() {
        return packagingRecyclingScheme;
    }

    @JsonProperty("packagingRecyclingScheme")
    public void setPackagingRecyclingScheme(SimpleCode[] packagingRecyclingScheme) {
        this.packagingRecyclingScheme = packagingRecyclingScheme;
    }

    @JsonProperty("packagingRecyclingProcessType")
    public SimpleCode[] getPackagingRecyclingProcessType() {
        return packagingRecyclingProcessType;
    }

    @JsonProperty("packagingRecyclingProcessType")
    public void setPackagingRecyclingProcessType(SimpleCode[] packagingRecyclingProcessType) {
        this.packagingRecyclingProcessType = packagingRecyclingProcessType;
    }

    @JsonProperty("packagingFunction")
    public SimpleCode[] getPackagingFunction() {
        return packagingFunction;
    }

    @JsonProperty("packagingFunction")
    public void setPackagingFunction(SimpleCode[] packagingFunction) {
        this.packagingFunction = packagingFunction;
    }

    @JsonProperty("packagingFeature")
    public SimpleCode[] getPackagingFeature() {
        return packagingFeature;
    }

    @JsonProperty("packagingFeature")
    public void setPackagingFeature(SimpleCode[] packagingFeature) {
        this.packagingFeature = packagingFeature;
    }

    @JsonProperty("packagingType")
    public String getPackagingType() {
        return packagingType;
    }

    @JsonProperty("packagingType")
    public void setPackagingType(String packagingType) {
        this.packagingType = packagingType;
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