package be.aktina.smartsearch.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NutrientBasis {
    private ConvenienceLevelPercent svalue;
    private String sunitCode;
    private ConvenienceLevelPercent dailyValueIntakePercent;
    private String type ="gs1:NutritionMeasurementType";

    @JsonProperty("s:value")
    public ConvenienceLevelPercent getSvalue() {
        return svalue;
    }

    @JsonProperty("s:value")
    public void setSvalue(ConvenienceLevelPercent svalue) {
        this.svalue = svalue;
    }

    @JsonProperty("s:unitCode")
    public String getSunitCode() {
        return sunitCode;
    }

    @JsonProperty("s:unitCode")
    public void setSunitCode(String sunitCode) {
        this.sunitCode = sunitCode;
    }

    @JsonProperty("dailyValueIntakePercent")
    public ConvenienceLevelPercent getDailyValueIntakePercent() {
        return dailyValueIntakePercent;
    }

    @JsonProperty("dailyValueIntakePercent")
    public void setDailyValueIntakePercent(ConvenienceLevelPercent dailyValueIntakePercent) {
        this.dailyValueIntakePercent = dailyValueIntakePercent;
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