package com.api.project.junit;

import io.restassured.http.ContentType;
import model.FirstUser;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteRequest {
    @Test
    public void putRequestJSON(){



        given()
                .when()
                .delete("https://jsonplaceholder.typicode.com/posts/1")
                .then()
                .statusCode(200)
                .log()
                .all();
    }
}
