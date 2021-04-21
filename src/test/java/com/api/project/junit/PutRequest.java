package com.api.project.junit;

import io.restassured.http.ContentType;
import model.FirstUser;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PutRequest {

    @Test
    public void putRequestJSON(){

        FirstUser user = new FirstUser();
        user.setFirstName("Mecazor");
        user.setLastName("Warrior");
        FirstUser.AddressBean addressBean = new FirstUser.AddressBean();
        addressBean.setAddress("Mars");
        addressBean.setEmail("mecazorwarrior@gmail.com");
        addressBean.setPhone(1010101010);

        user.setAddress(addressBean);

        given()
                .contentType(ContentType.JSON)
                .when()
                .body(user)
                .put("https://jsonplaceholder.typicode.com/posts/1")
                .then()
                .statusCode(200)
                .log()
                .all();
    }
}
