package be.aktina.smartsearch.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Certification {
    private LanguageValue[] certificationAgency;
    private LanguageValue[] certificationStandard;
    private LanguageValue[] certificationValue;
    private String type;

    @JsonProperty("certificationAgency")
    public LanguageValue[] getCertificationAgency() {
        return certificationAgency;
    }

    @JsonProperty("certificationAgency")
    public void setCertificationAgency(LanguageValue[] certificationAgency) {
        this.certificationAgency = certificationAgency;
    }

    @JsonProperty("certificationStandard")
    public LanguageValue[] getCertificationStandard() {
        return certificationStandard;
    }

    @JsonProperty("certificationStandard")
    public void setCertificationStandard(LanguageValue[] certificationStandard) {
        this.certificationStandard = certificationStandard;
    }

    @JsonProperty("certificationValue")
    public LanguageValue[] getCertificationValue() {
        return certificationValue;
    }

    @JsonProperty("certificationValue")
    public void setCertificationValue(LanguageValue[] certificationValue) {
        this.certificationValue = certificationValue;
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