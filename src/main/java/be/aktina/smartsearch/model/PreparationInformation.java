package be.aktina.smartsearch.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PreparationInformation {
    private LanguageValue[] preparationInstructions;
    private LanguageValue[] preparationConsumptionPrecautions;
    private SimpleCode manufacturerPreparationCode;
    private SimpleCode preparationCode;
    private ConvenienceLevelPercent convenienceLevelPercent;
    private Mesure minimumOptimumConsumptionTemperature;
    private Mesure maximumOptimumConsumptionTemperature;
    private String type;
    private Yield yield;

    @JsonProperty("preparationInstructions")
    public LanguageValue[] getPreparationInstructions() {
        return preparationInstructions;
    }

    @JsonProperty("preparationInstructions")
    public void setPreparationInstructions(LanguageValue[] preparationInstructions) {
        this.preparationInstructions = preparationInstructions;
    }

    @JsonProperty("preparationConsumptionPrecautions")
    public LanguageValue[] getPreparationConsumptionPrecautions() {
        return preparationConsumptionPrecautions;
    }

    @JsonProperty("preparationConsumptionPrecautions")
    public void setPreparationConsumptionPrecautions(LanguageValue[] preparationConsumptionPrecautions) {
        this.preparationConsumptionPrecautions = preparationConsumptionPrecautions;
    }

    @JsonProperty("manufacturerPreparationCode")
    public SimpleCode getManufacturerPreparationCode() {
        return manufacturerPreparationCode;
    }

    @JsonProperty("manufacturerPreparationCode")
    public void setManufacturerPreparationCode(SimpleCode manufacturerPreparationCode) {
        this.manufacturerPreparationCode = manufacturerPreparationCode;
    }

    @JsonProperty("preparationCode")
    public SimpleCode getPreparationCode() {
        return preparationCode;
    }

    @JsonProperty("preparationCode")
    public void setPreparationCode(SimpleCode preparationCode) {
        this.preparationCode = preparationCode;
    }

    @JsonProperty("convenienceLevelPercent")
    public ConvenienceLevelPercent getConvenienceLevelPercent() {
        return convenienceLevelPercent;
    }

    @JsonProperty("convenienceLevelPercent")
    public void setConvenienceLevelPercent(ConvenienceLevelPercent convenienceLevelPercent) {
        this.convenienceLevelPercent = convenienceLevelPercent;
    }

    @JsonProperty("minimumOptimumConsumptionTemperature")
    public Mesure getMinimumOptimumConsumptionTemperature() {
        return minimumOptimumConsumptionTemperature;
    }

    @JsonProperty("minimumOptimumConsumptionTemperature")
    public void setMinimumOptimumConsumptionTemperature(Mesure minimumOptimumConsumptionTemperature) {
        this.minimumOptimumConsumptionTemperature = minimumOptimumConsumptionTemperature;
    }

    @JsonProperty("maximumOptimumConsumptionTemperature")
    public Mesure getMaximumOptimumConsumptionTemperature() {
        return maximumOptimumConsumptionTemperature;
    }

    @JsonProperty("maximumOptimumConsumptionTemperature")
    public void setMaximumOptimumConsumptionTemperature(Mesure maximumOptimumConsumptionTemperature) {
        this.maximumOptimumConsumptionTemperature = maximumOptimumConsumptionTemperature;
    }

    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("yield")
    public Yield getYield() {
        return yield;
    }

    @JsonProperty("yield")
    public void setYield(Yield yield) {
        this.yield = yield;
    }
}