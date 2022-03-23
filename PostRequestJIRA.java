package com.api.assigments.weekend;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequestJIRA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI = "https://restapijira.atlassian.net/rest/api/2/issue";
		RestAssured.authentication = RestAssured.preemptive().basic("RestAPIJira@gmail.com",
				"5cpm7Dkyw9IPG7ir2hX65CF2");

		RequestSpecification inputRequest = RestAssured
				.given()
				.log()
				.all()
				.accept(ContentType.JSON)
				.contentType(ContentType.JSON)
				.body("{\r\n" + 
						"    \"fields\":{\r\n" + 
						"        \"project\":{\r\n" + 
						"            \"key\":\"AP\"\r\n" + 
						"        },\r\n" + 
						"        \"summary\":\"create issue in RA Project\",\r\n" + 
						"        \"description\":\"Creating of an issue using project keys and issue type names using the REST API\",\r\n" + 
						"        \"issuetype\":{\r\n" + 
						"            \"name\": \"Bug\"\r\n" + 
						"        }\r\n" + 
						"    }\r\n" + 
						"}");
	
		Response createResponse = inputRequest.post();
		createResponse.prettyPrint();
		System.out.println("Status code: "+createResponse.statusCode());
	
	}

}
