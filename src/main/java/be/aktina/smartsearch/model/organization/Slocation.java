package be.aktina.smartsearch.model.organization;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Slocation {
    private String sglobalLocationNumber;
    private Sgeo sgeo;
    private Saddress saddress;
    private String[] type;

    @JsonProperty("s:globalLocationNumber")
    public String getSglobalLocationNumber() {
        return sglobalLocationNumber;
    }

    @JsonProperty("s:globalLocationNumber")
    public void setSglobalLocationNumber(String sglobalLocationNumber) {
        this.sglobalLocationNumber = sglobalLocationNumber;
    }

    @JsonProperty("s:geo")
    public Sgeo getSgeo() {
        return sgeo;
    }

    @JsonProperty("s:geo")
    public void setSgeo(Sgeo sgeo) {
        this.sgeo = sgeo;
    }

    @JsonProperty("s:address")
    public Saddress getSaddress() {
        return saddress;
    }

    @JsonProperty("s:address")
    public void setSaddress(Saddress saddress) {
        this.saddress = saddress;
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
