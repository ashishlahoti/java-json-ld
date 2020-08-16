package com.cnc;

import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldId;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldProperty;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldType;

@JsonldType("http://schema.org/Organization")
public class Organization {

	@JsonldId
	public Integer id;

	@JsonldProperty("http://schema.org/url")
	public String url;

	@JsonldProperty("http://schema.org/name")
	public String name;

	@JsonldProperty("http://schema.org/location")
	public Location location;

}
