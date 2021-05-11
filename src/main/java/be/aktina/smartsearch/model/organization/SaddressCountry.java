package be.aktina.smartsearch.model.organization;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SaddressCountry {
    private String countryCode;
    private String countrySubdivisionCode;
    private String[] type;

    @JsonProperty("countryCode")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("countryCode")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("countrySubdivisionCode")
    public String getCountrySubdivisionCode() {
        return countrySubdivisionCode;
    }

    @JsonProperty("countrySubdivisionCode")
    public void setCountrySubdivisionCode(String countrySubdivisionCode) {
        this.countrySubdivisionCode = countrySubdivisionCode;
    }

    @JsonProperty("@type")
    public String[] getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(String[] type) {
        this.type = type;
    }
}