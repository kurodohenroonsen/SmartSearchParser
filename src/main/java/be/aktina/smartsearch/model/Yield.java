package be.aktina.smartsearch.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Yield {
    private SimpleCode productYieldType;
    private ConvenienceLevelPercent productYieldVariationPercentage;
    private Mesure productYield;
    private String type;

    @JsonProperty("productYieldType")
    public SimpleCode getProductYieldType() {
        return productYieldType;
    }

    @JsonProperty("productYieldType")
    public void setProductYieldType(SimpleCode productYieldType) {
        this.productYieldType = productYieldType;
    }

    @JsonProperty("productYieldVariationPercentage")
    public ConvenienceLevelPercent getProductYieldVariationPercentage() {
        return productYieldVariationPercentage;
    }

    @JsonProperty("productYieldVariationPercentage")
    public void setProductYieldVariationPercentage(ConvenienceLevelPercent productYieldVariationPercentage) {
        this.productYieldVariationPercentage = productYieldVariationPercentage;
    }

    @JsonProperty("productYield")
    public Mesure getProductYield() {
        return productYield;
    }

    @JsonProperty("productYield")
    public void setProductYield(Mesure productYield) {
        this.productYield = productYield;
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