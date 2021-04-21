package com.api.project.junit;

import io.restassured.http.ContentType;
import model.FirstUser;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class POSTRequest {
    @Test
    public void postJSON() {
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
                .post("https://jsonplaceholder.typicode.com/users")
                .then()
                .statusCode(201)
                .log()
                .all();
    }
}
