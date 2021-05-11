package be.aktina.smartsearch.model.organization;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sgeo {
    private Slatitude slatitude;
    private Slatitude slongitude;
    private String[] type;

    @JsonProperty("s:latitude")
    public Slatitude getSlatitude() {
        return slatitude;
    }

    @JsonProperty("s:latitude")
    public void setSlatitude(Slatitude slatitude) {
        this.slatitude = slatitude;
    }

    @JsonProperty("s:longitude")
    public Slatitude getSlongitude() {
        return slongitude;
    }

    @JsonProperty("s:longitude")
    public void setSlongitude(Slatitude slongitude) {
        this.slongitude = slongitude;
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
