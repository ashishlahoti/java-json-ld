package com.cnc;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.jsonldjava.core.JsonLdOptions;
import com.github.jsonldjava.core.JsonLdProcessor;
import com.github.jsonldjava.utils.JsonUtils;

public class TransformToJavaObj {
	public static void main(String[] args) throws IOException {

		// Read from JSON-LD file
		InputStream inputStream = new FileInputStream("input.json");
		Object jsonObject = JsonUtils.fromInputStream(inputStream);

		// Transform to Simple JSON compact object
		Object compact = JsonLdProcessor.compact(jsonObject, new HashMap<>(), new JsonLdOptions());
		
		// Convert JSON to String
		String compactContent = JsonUtils.toPrettyString(compact);
		System.out.println(compactContent);
		
		// Map JSON to POJO
		ObjectMapper objectMapper = new ObjectMapper();
		PersonJson person = objectMapper.readValue(compactContent, PersonJson.class);
		System.out.println(person);

	}
}
