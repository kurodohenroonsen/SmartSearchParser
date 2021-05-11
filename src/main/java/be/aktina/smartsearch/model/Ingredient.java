package be.aktina.smartsearch.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ingredient {
    private String type;
    private ConvenienceLevelPercent ingredientSequence;
    private LanguageValue[] ingredientName;

    @JsonProperty("@type")
    public String getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("ingredientSequence")
    public ConvenienceLevelPercent getIngredientSequence() {
        return ingredientSequence;
    }

    @JsonProperty("ingredientSequence")
    public void setIngredientSequence(ConvenienceLevelPercent ingredientSequence) {
        this.ingredientSequence = ingredientSequence;
    }

    @JsonProperty("ingredientName")
    public LanguageValue[] getIngredientName() {
        return ingredientName;
    }

    @JsonProperty("ingredientName")
    public void setIngredientName(LanguageValue[] ingredientName) {
        this.ingredientName = ingredientName;
    }
}