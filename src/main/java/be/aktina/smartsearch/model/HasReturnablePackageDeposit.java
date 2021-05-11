package be.aktina.smartsearch.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HasReturnablePackageDeposit {
    private ReturnablePackageDepositAmount returnablePackageDepositAmount;
    private CountryOfOrigin returnablePackageDepositRegion;
    private String type;

    @JsonProperty("returnablePackageDepositAmount")
    public ReturnablePackageDepositAmount getReturnablePackageDepositAmount() {
        return returnablePackageDepositAmount;
    }

    @JsonProperty("returnablePackageDepositAmount")
    public void setReturnablePackageDepositAmount(ReturnablePackageDepositAmount returnablePackageDepositAmount) {
        this.returnablePackageDepositAmount = returnablePackageDepositAmount;
    }

    @JsonProperty("returnablePackageDepositRegion")
    public CountryOfOrigin getReturnablePackageDepositRegion() {
        return returnablePackageDepositRegion;
    }

    @JsonProperty("returnablePackageDepositRegion")
    public void setReturnablePackageDepositRegion(CountryOfOrigin returnablePackageDepositRegion) {
        this.returnablePackageDepositRegion = returnablePackageDepositRegion;
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