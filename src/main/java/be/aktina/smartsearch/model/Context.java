package be.aktina.smartsearch.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Context {
    private String gs1 ="http://gs1.org/voc/";
    private String s = "https://schema.org/";
    private String xsd = "http://www.w3.org/2001/XMLSchema#";
    private String vocab= "http://gs1.org/voc/";

    @JsonProperty("gs1")
    public String getGs1() {
        return gs1;
    }

    @JsonProperty("gs1")
    public void setGs1(String gs1) {
        this.gs1 = gs1;
    }

    @JsonProperty("s")
    public String getS() {
        return s;
    }

    @JsonProperty("s")
    public void setS(String s) {
        this.s = s;
    }

    @JsonProperty("xsd")
    public String getXsd() {
        return xsd;
    }

    @JsonProperty("xsd")
    public void setXsd(String xsd) {
        this.xsd = xsd;
    }

    @JsonProperty("@vocab")
    public String getVocab() {
        return vocab;
    }

    @JsonProperty("@vocab")
    public void setVocab(String vocab) {
        this.vocab = vocab;
    }
}