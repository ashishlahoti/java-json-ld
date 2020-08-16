package com.cnc;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonJson {
    @JsonProperty("@id")
    private String id;
    @JsonProperty("@type")
    private String type;
    @JsonProperty("http://schema.org/name")
    private String name;
    @JsonProperty("http://schema.org/url")
    private String url;
    @JsonProperty("http://schema.org/jobTitle")
    private String jobtitle;

}
