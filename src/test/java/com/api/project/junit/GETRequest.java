package com.api.project.junit;

import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.RestAssured.given;

public class GETRequest {

    @Test
    public void getJsonPlaceholder(){
        Response response = given()
                .when()
                .get("https://jsonplaceholder.typicode.com/users/1");

        System.out.println(response.body().asString());

    }

    @Test
    public void statusCode(){

        given()
                .when()
                .get("https://www.google.com")
                .then()
                .statusCode(200);
    }
}
