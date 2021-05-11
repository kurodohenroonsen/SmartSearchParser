package be.aktina.smartsearch.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrganicClaim {
    private ConvenienceLevelPercent organicClaimPercent;
    private SimpleCode[] organicClaimAgency;
    private String type;

    @JsonProperty("organicClaimPercent")
    public ConvenienceLevelPercent getOrganicClaimPercent() {
        return organicClaimPercent;
    }

    @JsonProperty("organicClaimPercent")
    public void setOrganicClaimPercent(ConvenienceLevelPercent organicClaimPercent) {
        this.organicClaimPercent = organicClaimPercent;
    }

    @JsonProperty("organicClaimAgency")
    public SimpleCode[] getOrganicClaimAgency() {
        return organicClaimAgency;
    }

    @JsonProperty("organicClaimAgency")
    public void setOrganicClaimAgency(SimpleCode[] organicClaimAgency) {
        this.organicClaimAgency = organicClaimAgency;
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