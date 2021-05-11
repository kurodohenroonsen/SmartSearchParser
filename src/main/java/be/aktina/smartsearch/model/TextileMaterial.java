package be.aktina.smartsearch.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TextileMaterial {
    private LanguageValue[] textileMaterialDescription;
    private LanguageValue[] textileMaterialThreadCount;
    private ConvenienceLevelPercent textileMaterialPercentage;
    private Mesure textileMaterialWeight;
    private String type;

    @JsonProperty("textileMaterialDescription")
    public LanguageValue[] getTextileMaterialDescription() {
        return textileMaterialDescription;
    }

    @JsonProperty("textileMaterialDescription")
    public void setTextileMaterialDescription(LanguageValue[] textileMaterialDescription) {
        this.textileMaterialDescription = textileMaterialDescription;
    }

    @JsonProperty("textileMaterialThreadCount")
    public LanguageValue[] getTextileMaterialThreadCount() {
        return textileMaterialThreadCount;
    }

    @JsonProperty("textileMaterialThreadCount")
    public void setTextileMaterialThreadCount(LanguageValue[] textileMaterialThreadCount) {
        this.textileMaterialThreadCount = textileMaterialThreadCount;
    }

    @JsonProperty("textileMaterialPercentage")
    public ConvenienceLevelPercent getTextileMaterialPercentage() {
        return textileMaterialPercentage;
    }

    @JsonProperty("textileMaterialPercentage")
    public void setTextileMaterialPercentage(ConvenienceLevelPercent textileMaterialPercentage) {
        this.textileMaterialPercentage = textileMaterialPercentage;
    }

    @JsonProperty("textileMaterialWeight")
    public Mesure getTextileMaterialWeight() {
        return textileMaterialWeight;
    }

    @JsonProperty("textileMaterialWeight")
    public void setTextileMaterialWeight(Mesure textileMaterialWeight) {
        this.textileMaterialWeight = textileMaterialWeight;
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