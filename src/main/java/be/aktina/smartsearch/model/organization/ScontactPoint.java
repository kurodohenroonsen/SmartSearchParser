package be.aktina.smartsearch.model.organization;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ScontactPoint {
    private Sname[] scontactType;
    private Sname[] contactTitle;
    private Sname[] responsibility;
    private String semail;
    private String stelephone;
    private String sfaxNumber;
    private String[] savailableLanguage;
    private String[] type;

    @JsonProperty("s:contactType")
    public Sname[] getScontactType() {
        return scontactType;
    }

    @JsonProperty("s:contactType")
    public void setScontactType(Sname[] scontactType) {
        this.scontactType = scontactType;
    }

    @JsonProperty("contactTitle")
    public Sname[] getContactTitle() {
        return contactTitle;
    }

    @JsonProperty("contactTitle")
    public void setContactTitle(Sname[] contactTitle) {
        this.contactTitle = contactTitle;
    }

    @JsonProperty("responsibility")
    public Sname[] getResponsibility() {
        return responsibility;
    }

    @JsonProperty("responsibility")
    public void setResponsibility(Sname[] responsibility) {
        this.responsibility = responsibility;
    }

    @JsonProperty("s:email")
    public String getSemail() {
        return semail;
    }

    @JsonProperty("s:email")
    public void setSemail(String semail) {
        this.semail = semail;
    }

    @JsonProperty("s:telephone")
    public String getStelephone() {
        return stelephone;
    }

    @JsonProperty("s:telephone")
    public void setStelephone(String stelephone) {
        this.stelephone = stelephone;
    }

    @JsonProperty("s:faxNumber")
    public String getSfaxNumber() {
        return sfaxNumber;
    }

    @JsonProperty("s:faxNumber")
    public void setSfaxNumber(String sfaxNumber) {
        this.sfaxNumber = sfaxNumber;
    }

    @JsonProperty("s:availableLanguage")
    public String[] getSavailableLanguage() {
        return savailableLanguage;
    }

    @JsonProperty("s:availableLanguage")
    public void setSavailableLanguage(String[] savailableLanguage) {
        this.savailableLanguage = savailableLanguage;
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
