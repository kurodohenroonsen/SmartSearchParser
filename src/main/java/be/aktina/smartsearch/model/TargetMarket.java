package be.aktina.smartsearch.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TargetMarket {
    private ConvenienceLevelPercent consumerFirstAvailabilityDateTime;
    private CountryOfOrigin targetMarketCountries;
    private String type;

    @JsonProperty("consumerFirstAvailabilityDateTime")
    public ConvenienceLevelPercent getConsumerFirstAvailabilityDateTime() {
        return consumerFirstAvailabilityDateTime;
    }

    @JsonProperty("consumerFirstAvailabilityDateTime")
    public void setConsumerFirstAvailabilityDateTime(ConvenienceLevelPercent consumerFirstAvailabilityDateTime) {
        this.consumerFirstAvailabilityDateTime = consumerFirstAvailabilityDateTime;
    }

    @JsonProperty("targetMarketCountries")
    public CountryOfOrigin getTargetMarketCountries() {
        return targetMarketCountries;
    }

    @JsonProperty("targetMarketCountries")
    public void setTargetMarketCountries(CountryOfOrigin targetMarketCountries) {
        this.targetMarketCountries = targetMarketCountries;
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