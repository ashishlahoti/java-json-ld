package com.cnc;

import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldProperty;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldType;

@JsonldType("http://schema.org/PostalAddress")
public class Location {

	@JsonldProperty("http://schema.org/streetAddress")
	public String address;

	@JsonldProperty("http://schema.org/addressLocality")
	public String city;

	@JsonldProperty("http://schema.org/addressRegion")
	public String state;

	@JsonldProperty("http://schema.org/addressCountry")
	public String country;

	@JsonldProperty("http://schema.org/postalCode")
	public String zipcode;
}
