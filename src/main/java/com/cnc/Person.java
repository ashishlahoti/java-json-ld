package com.cnc;

import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldId;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldProperty;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldType;

@JsonldType("http://schema.org/Person")
public class Person {

	@JsonldId
	public String id;

	@JsonldProperty("http://schema.org/name")
	public String name;

	@JsonldProperty("http://schema.org/jobTitle")
	public String jobtitle;

	@JsonldProperty("http://schema.org/url")
	public String url;
}
