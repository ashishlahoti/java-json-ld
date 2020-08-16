package com.cnc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import ioinformarics.oss.jackson.module.jsonld.JsonldModule;
import ioinformarics.oss.jackson.module.jsonld.JsonldResource;

public class TransformToJsonLD {

	public static void main(String[] args) throws JsonProcessingException {

		// Register Jsonld Module with Jackson
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		objectMapper.registerModule(new JsonldModule(() -> objectMapper.createObjectNode()));

		// Create Person Instance
		Person person = new Person();
		person.id = "mailto:lahoti.ashish20@gmail.com";
		person.name = "Ashish Lahoti";
		person.jobtitle = "Software Developer";
		person.url = "https://codingnconcepts.com";

		// Transform to JSON-LD
		String personJsonLd = objectMapper.writer().writeValueAsString(JsonldResource.Builder.create().build(person));
		System.out.println(personJsonLd);

		// Create Organization and Location Instances
		Location location = new Location();
		location.address = "7 S. Broadway";
		location.city = "Denver";
		location.state = "CO";
		location.country = "USA";
		location.zipcode = "80209";

		Organization org = new Organization();
		org.id = 12345;
		org.url = "https://codingnconcepts.com";
		org.name = "CodingNConcepts";
		org.location = location;

		// Transform to JSON-LD
		String orgJsonLd = objectMapper.writer().writeValueAsString(JsonldResource.Builder.create().build(org));
		System.out.println(orgJsonLd);
	}
}
