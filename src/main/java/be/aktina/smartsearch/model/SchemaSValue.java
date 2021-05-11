package be.aktina.smartsearch.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SchemaSValue {
	   private String value;
	   private String type;

	   @JsonProperty("@value")
	    public String getValue() {
	        return value;
	    }

	    @JsonProperty("@value")
	    public void setValue(String value) {
	        this.value = value;
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