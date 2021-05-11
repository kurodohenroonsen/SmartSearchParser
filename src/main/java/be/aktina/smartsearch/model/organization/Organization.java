package be.aktina.smartsearch.model.organization;

import com.fasterxml.jackson.annotation.JsonProperty;

import be.aktina.smartsearch.model.Context;

public class Organization {
    private String[] type;
    private String id;
    private Sname[] sname;
    private Sname[] department;
    private String additionalOrganizationIdentificationTypeValue;
    private String organizationRole;
    private String globalLocationNumber;
    private Saddress saddress;
    private Slocation slocation;
    private ScontactPoint scontactPoint;
    private ScontactPoint afterHoursContactPoints;
    private SmakesOffer[] smakesOffer;


    @JsonProperty("@type")
    public String[] getType() {
    	
        return new String[] {"gs1:Organization","s:Organization"};
    }

    @JsonProperty("@type")
    public void setType(String[] type) {
        this.type = type;
    }

    @JsonProperty("@id")
    public String getId() {
        return id;
    }

    @JsonProperty("@id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("s:name")
    public Sname[] getSname() {
        return sname;
    }

    @JsonProperty("s:name")
    public void setSname(Sname[] sname) {
        this.sname = sname;
    }

    @JsonProperty("department")
    public Sname[] getDepartment() {
        return department;
    }

    @JsonProperty("department")
    public void setDepartment(Sname[] department) {
        this.department = department;
    }

    @JsonProperty("additionalOrganizationIdentificationTypeValue")
    public String getAdditionalOrganizationIdentificationTypeValue() {
        return additionalOrganizationIdentificationTypeValue;
    }

    @JsonProperty("additionalOrganizationIdentificationTypeValue")
    public void setAdditionalOrganizationIdentificationTypeValue(String additionalOrganizationIdentificationTypeValue) {
        this.additionalOrganizationIdentificationTypeValue = additionalOrganizationIdentificationTypeValue;
    }

    @JsonProperty("organizationRole")
    public String getOrganizationRole() {
        return organizationRole;
    }

    @JsonProperty("organizationRole")
    public void setOrganizationRole(String organizationRole) {
        this.organizationRole = organizationRole;
    }

    @JsonProperty("globalLocationNumber")
    public String getGlobalLocationNumber() {
        return globalLocationNumber;
    }

    @JsonProperty("globalLocationNumber")
    public void setGlobalLocationNumber(String globalLocationNumber) {
        this.globalLocationNumber = globalLocationNumber;
    }

    @JsonProperty("s:address")
    public Saddress getSaddress() {
        return saddress;
    }

    @JsonProperty("s:address")
    public void setSaddress(Saddress saddress) {
        this.saddress = saddress;
    }

    @JsonProperty("s:location")
    public Slocation getSlocation() {
        return slocation;
    }

    @JsonProperty("s:location")
    public void setSlocation(Slocation slocation) {
        this.slocation = slocation;
    }

    @JsonProperty("s:contactPoint")
    public ScontactPoint getScontactPoint() {
        return scontactPoint;
    }

    @JsonProperty("s:contactPoint")
    public void setScontactPoint(ScontactPoint scontactPoint) {
        this.scontactPoint = scontactPoint;
    }

    @JsonProperty("afterHoursContactPoints")
    public ScontactPoint getAfterHoursContactPoints() {
        return afterHoursContactPoints;
    }

    @JsonProperty("afterHoursContactPoints")
    public void setAfterHoursContactPoints(ScontactPoint afterHoursContactPoints) {
        this.afterHoursContactPoints = afterHoursContactPoints;
    }

    @JsonProperty("s:makesOffer")
    public SmakesOffer[] getSmakesOffer() {
        return smakesOffer;
    }

    @JsonProperty("s:makesOffer")
    public void setSmakesOffer(SmakesOffer[] smakesOffer) {
        this.smakesOffer = smakesOffer;
    }
}
