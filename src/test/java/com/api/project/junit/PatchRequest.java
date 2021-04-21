package com.api.project.junit;

import io.restassured.http.ContentType;
import model.FirstUser;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PatchRequest {
    @Test
    public void putRequestJSON(){

        FirstUser user = new FirstUser();
        user.setFirstName("Mecazor");
        user.setLastName("Warrior");


        given()
                .contentType(ContentType.JSON)
                .when()
                .body(user)
                .patch("https://jsonplaceholder.typicode.com/posts/1")
                .then()
                .statusCode(200)
                .log()
                .all();
    }
}
