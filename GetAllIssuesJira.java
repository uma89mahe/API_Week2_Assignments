package com.api.assigments.weekend;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllIssuesJira {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI="https://restapijira.atlassian.net/rest/api/2/search";
		RestAssured.authentication = RestAssured.preemptive().basic("RestAPIJira@gmail.com","5cpm7Dkyw9IPG7ir2hX65CF2");
		
		//Map<String, String> allQueryParams
		
		RequestSpecification inputRequest = RestAssured
				.given()
				.log()
				.all()				
				.accept(ContentType.JSON);				
				
		
		Response getResponse = inputRequest.get();
		getResponse.prettyPrint();
		System.out.println("Status code: "+getResponse.statusCode());
		
	}

}
