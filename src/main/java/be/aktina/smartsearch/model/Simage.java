package be.aktina.smartsearch.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class Simage {
	@JsonInclude(Include.NON_NULL)
	private ConvenienceLevelPercent swidth;
	@JsonInclude(Include.NON_NULL)
	private ConvenienceLevelPercent sheight;
    private SimpleCode surl;
    private String[] type;

    @JsonProperty("s:width")
    public ConvenienceLevelPercent getSwidth() {
        return swidth;
    }

    @JsonProperty("s:width")
    public void setSwidth(ConvenienceLevelPercent swidth) {
        this.swidth = swidth;
    }

    @JsonProperty("s:height")
    public ConvenienceLevelPercent getSheight() {
        return sheight;
    }

    @JsonProperty("s:height")
    public void setSheight(ConvenienceLevelPercent sheight) {
        this.sheight = sheight;
    }

    @JsonProperty("s:url")
    public SimpleCode getSurl() {
        return surl;
    }

    @JsonProperty("s:url")
    public void setSurl(SimpleCode surl) {
        this.surl = surl;
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
