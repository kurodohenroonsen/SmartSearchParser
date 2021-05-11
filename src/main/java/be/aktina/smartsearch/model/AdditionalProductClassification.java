package be.aktina.smartsearch.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AdditionalProductClassification {
    private String additionalProductClassificationCode;
    private String additionalProductClassificationValue;
    private LanguageValue[] additionalProductClassificationDescription;
    private String type;

    @JsonProperty("additionalProductClassificationCode")
    public String getAdditionalProductClassificationCode() {
        return additionalProductClassificationCode;
    }

    @JsonProperty("additionalProductClassificationCode")
    public void setAdditionalProductClassificationCode(String additionalProductClassificationCode) {
        this.additionalProductClassificationCode = additionalProductClassificationCode;
    }

    @JsonProperty("additionalProductClassificationValue")
    public String getAdditionalProductClassificationValue() {
        return additionalProductClassificationValue;
    }

    @JsonProperty("additionalProductClassificationValue")
    public void setAdditionalProductClassificationValue(String additionalProductClassificationValue) {
        this.additionalProductClassificationValue = additionalProductClassificationValue;
    }

    @JsonProperty("additionalProductClassificationDescription")
    public LanguageValue[] getAdditionalProductClassificationDescription() {
        return additionalProductClassificationDescription;
    }

    @JsonProperty("additionalProductClassificationDescription")
    public void setAdditionalProductClassificationDescription(LanguageValue[] additionalProductClassificationDescription) {
        this.additionalProductClassificationDescription = additionalProductClassificationDescription;
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