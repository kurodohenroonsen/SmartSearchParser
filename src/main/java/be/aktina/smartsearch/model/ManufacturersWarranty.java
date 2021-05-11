package be.aktina.smartsearch.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ManufacturersWarranty {
    private Mesure sdurationOfWarranty;
    private LanguageValue[] sdescription;
    private String[] type;

    @JsonProperty("s:durationOfWarranty")
    public Mesure getSdurationOfWarranty() {
        return sdurationOfWarranty;
    }

    @JsonProperty("s:durationOfWarranty")
    public void setSdurationOfWarranty(Mesure sdurationOfWarranty) {
        this.sdurationOfWarranty = sdurationOfWarranty;
    }

    @JsonProperty("s:description")
    public LanguageValue[] getSdescription() {
        return sdescription;
    }

    @JsonProperty("s:description")
    public void setSdescription(LanguageValue[] sdescription) {
        this.sdescription = sdescription;
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