package be.aktina.smartsearch.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AwardPrize {
    private String awardPrizeCode;
    private LanguageValue[] awardPrizeName;
    private LanguageValue[] awardPrizeJury;
    private LanguageValue[] awardPrizeDescription;
    private ConvenienceLevelPercent awardPrizeYear;
    private CountryOfOrigin awardPrizeCountryCode;
    private String type;

    @JsonProperty("awardPrizeCode")
    public String getAwardPrizeCode() {
        return awardPrizeCode;
    }

    @JsonProperty("awardPrizeCode")
    public void setAwardPrizeCode(String awardPrizeCode) {
        this.awardPrizeCode = awardPrizeCode;
    }

    @JsonProperty("awardPrizeName")
    public LanguageValue[] getAwardPrizeName() {
        return awardPrizeName;
    }

    @JsonProperty("awardPrizeName")
    public void setAwardPrizeName(LanguageValue[] awardPrizeName) {
        this.awardPrizeName = awardPrizeName;
    }

    @JsonProperty("awardPrizeJury")
    public LanguageValue[] getAwardPrizeJury() {
        return awardPrizeJury;
    }

    @JsonProperty("awardPrizeJury")
    public void setAwardPrizeJury(LanguageValue[] awardPrizeJury) {
        this.awardPrizeJury = awardPrizeJury;
    }

    @JsonProperty("awardPrizeDescription")
    public LanguageValue[] getAwardPrizeDescription() {
        return awardPrizeDescription;
    }

    @JsonProperty("awardPrizeDescription")
    public void setAwardPrizeDescription(LanguageValue[] awardPrizeDescription) {
        this.awardPrizeDescription = awardPrizeDescription;
    }

    @JsonProperty("awardPrizeYear")
    public ConvenienceLevelPercent getAwardPrizeYear() {
        return awardPrizeYear;
    }

    @JsonProperty("awardPrizeYear")
    public void setAwardPrizeYear(ConvenienceLevelPercent awardPrizeYear) {
        this.awardPrizeYear = awardPrizeYear;
    }

    @JsonProperty("awardPrizeCountryCode")
    public CountryOfOrigin getAwardPrizeCountryCode() {
        return awardPrizeCountryCode;
    }

    @JsonProperty("awardPrizeCountryCode")
    public void setAwardPrizeCountryCode(CountryOfOrigin awardPrizeCountryCode) {
        this.awardPrizeCountryCode = awardPrizeCountryCode;
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