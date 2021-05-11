package be.aktina.smartsearch.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PackagingMaterial {
    private Mesure packagingMaterialCompositionQuantity;
    private Mesure packagingMaterialThickness;
    private SimpleCode[] packagingMaterialType;
    private String type;

    @JsonProperty("packagingMaterialCompositionQuantity")
    public Mesure getPackagingMaterialCompositionQuantity() {
        return packagingMaterialCompositionQuantity;
    }

    @JsonProperty("packagingMaterialCompositionQuantity")
    public void setPackagingMaterialCompositionQuantity(Mesure packagingMaterialCompositionQuantity) {
        this.packagingMaterialCompositionQuantity = packagingMaterialCompositionQuantity;
    }

    @JsonProperty("packagingMaterialThickness")
    public Mesure getPackagingMaterialThickness() {
        return packagingMaterialThickness;
    }

    @JsonProperty("packagingMaterialThickness")
    public void setPackagingMaterialThickness(Mesure packagingMaterialThickness) {
        this.packagingMaterialThickness = packagingMaterialThickness;
    }

    @JsonProperty("packagingMaterialType")
    public SimpleCode[] getPackagingMaterialType() {
        return packagingMaterialType;
    }

    @JsonProperty("packagingMaterialType")
    public void setPackagingMaterialType(SimpleCode[] packagingMaterialType) {
        this.packagingMaterialType = packagingMaterialType;
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