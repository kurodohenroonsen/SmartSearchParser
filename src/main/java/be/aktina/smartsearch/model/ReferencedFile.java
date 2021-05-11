package be.aktina.smartsearch.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReferencedFile {
    private SimpleCode surl;
    private SimpleCode referencedFileType;
    private Mesure scontentSize;
    private String sinLanguage;
    private ConvenienceLevelPercent sdatePublished;
    private ConvenienceLevelPercent sexpires;
    private ConvenienceLevelPercent swidth;
    private ConvenienceLevelPercent sheight;
    private String[] type;

    @JsonProperty("s:url")
    public SimpleCode getSurl() {
        return surl;
    }

    @JsonProperty("s:url")
    public void setSurl(SimpleCode surl) {
        this.surl = surl;
    }

    @JsonProperty("referencedFileType")
    public SimpleCode getReferencedFileType() {
        return referencedFileType;
    }

    @JsonProperty("referencedFileType")
    public void setReferencedFileType(SimpleCode referencedFileType) {
        this.referencedFileType = referencedFileType;
    }

    @JsonProperty("s:contentSize")
    public Mesure getScontentSize() {
        return scontentSize;
    }

    @JsonProperty("s:contentSize")
    public void setScontentSize(Mesure scontentSize) {
        this.scontentSize = scontentSize;
    }

    @JsonProperty("s:inLanguage")
    public String getSinLanguage() {
        return sinLanguage;
    }

    @JsonProperty("s:inLanguage")
    public void setSinLanguage(String sinLanguage) {
        this.sinLanguage = sinLanguage;
    }

    @JsonProperty("s:datePublished")
    public ConvenienceLevelPercent getSdatePublished() {
        return sdatePublished;
    }

    @JsonProperty("s:datePublished")
    public void setSdatePublished(ConvenienceLevelPercent sdatePublished) {
        this.sdatePublished = sdatePublished;
    }

    @JsonProperty("s:expires")
    public ConvenienceLevelPercent getSexpires() {
        return sexpires;
    }

    @JsonProperty("s:expires")
    public void setSexpires(ConvenienceLevelPercent sexpires) {
        this.sexpires = sexpires;
    }

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

    @JsonProperty("@type")
    public String[] getType() {
        return type;
    }

    @JsonProperty("@type")
    public void setType(String[] type) {
        this.type = type;
    }
}