package be.aktina.smartsearch.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReturnablePackageDepositAmount {
    private ConvenienceLevelPercent sprice;
    private String spriceCurrency;
    private String[] type;

    @JsonProperty("s:price")
    public ConvenienceLevelPercent getSprice() {
        return sprice;
    }

    @JsonProperty("s:price")
    public void setSprice(ConvenienceLevelPercent sprice) {
        this.sprice = sprice;
    }

    @JsonProperty("s:priceCurrency")
    public String getSpriceCurrency() {
        return spriceCurrency;
    }

    @JsonProperty("s:priceCurrency")
    public void setSpriceCurrency(String spriceCurrency) {
        this.spriceCurrency = spriceCurrency;
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