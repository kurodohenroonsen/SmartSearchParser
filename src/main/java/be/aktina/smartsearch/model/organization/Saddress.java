package be.aktina.smartsearch.model.organization;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Saddress {
    private Sname[] sname;
    private Sname[] sstreetAddress;
    private Sname[] crossStreet;
    private Sname[] saddressLocality;
    private Sname[] saddressRegion;
    private String countyCode;
    private String spostOfficeBoxNumber;
    private String spostalCode;
    private SaddressCountry saddressCountry;
    private String[] type;

    @JsonProperty("s:name")
    public Sname[] getSname() {
        return sname;
    }

    @JsonProperty("s:name")
    public void setSname(Sname[] sname) {
        this.sname = sname;
    }

    @JsonProperty("s:streetAddress")
    public Sname[] getSstreetAddress() {
        return sstreetAddress;
    }

    @JsonProperty("s:streetAddress")
    public void setSstreetAddress(Sname[] sstreetAddress) {
        this.sstreetAddress = sstreetAddress;
    }

    @JsonProperty("crossStreet")
    public Sname[] getCrossStreet() {
        return crossStreet;
    }

    @JsonProperty("crossStreet")
    public void setCrossStreet(Sname[] crossStreet) {
        this.crossStreet = crossStreet;
    }

    @JsonProperty("s:addressLocality")
    public Sname[] getSaddressLocality() {
        return saddressLocality;
    }

    @JsonProperty("s:addressLocality")
    public void setSaddressLocality(Sname[] saddressLocality) {
        this.saddressLocality = saddressLocality;
    }

    @JsonProperty("s:addressRegion")
    public Sname[] getSaddressRegion() {
        return saddressRegion;
    }

    @JsonProperty("s:addressRegion")
    public void setSaddressRegion(Sname[] saddressRegion) {
        this.saddressRegion = saddressRegion;
    }

    @JsonProperty("countyCode")
    public String getCountyCode() {
        return countyCode;
    }

    @JsonProperty("countyCode")
    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    @JsonProperty("s:postOfficeBoxNumber")
    public String getSpostOfficeBoxNumber() {
        return spostOfficeBoxNumber;
    }

    @JsonProperty("s:postOfficeBoxNumber")
    public void setSpostOfficeBoxNumber(String spostOfficeBoxNumber) {
        this.spostOfficeBoxNumber = spostOfficeBoxNumber;
    }

    @JsonProperty("s:postalCode")
    public String getSpostalCode() {
        return spostalCode;
    }

    @JsonProperty("s:postalCode")
    public void setSpostalCode(String spostalCode) {
        this.spostalCode = spostalCode;
    }

    @JsonProperty("s:addressCountry")
    public SaddressCountry getSaddressCountry() {
        return saddressCountry;
    }

    @JsonProperty("s:addressCountry")
    public void setSaddressCountry(SaddressCountry saddressCountry) {
        this.saddressCountry = saddressCountry;
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