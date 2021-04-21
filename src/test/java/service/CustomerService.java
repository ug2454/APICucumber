package service;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import model.CustomerPojo;
import util.ResponseHelper;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class CustomerService {
    private RequestSpecification request;
    private Response response;
    CustomerPojo customerPojo;

    public CustomerService() {
        customerPojo = new CustomerPojo();
    }

    public void customerData(String firstName, String lastName, String phoneNumber, String address1, String address2) {
        ArrayList<String> addresses = new ArrayList<>();
        addresses.add(address1);
        addresses.add(address2);
        customerPojo.setFirstName(firstName);
        customerPojo.setLastName(lastName);
        customerPojo.setPhone(phoneNumber);
        customerPojo.setAddresses(addresses);


    }

    public void customerHeader() {
        request = given().header("Content-Type", "application/json").header("Accept-Charset", "UTF-8").log().headers();
    }

    public void createPostRequest() {
        response = request.when().body(customerPojo).log().body().post("https://jsonplaceholder.typicode.com/users");
    }

    public void verifyStatusCode(int statusCode) {
        response.then().statusCode(statusCode).log().all();
    }

    public void verifyResponse(List<String> responseMap) {
        ResponseHelper.responseValidations(response, responseMap);
    }
}
