package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import service.CustomerService;

import java.util.List;


public class CustomerSteps {

    CustomerService customerService = new CustomerService();


    @Given("^I have the data to create customer with (.*) , (.*) , (.*) , (.*) , (.*)$")
    public void customerData(String firstName, String lastName, String phoneNumber, String address1, String address2) {
        customerService.customerData(firstName, lastName, phoneNumber, address1, address2);
    }

    @And("^I use customer header$")
    public void customerHeader() {
        customerService.customerHeader();
    }

    @When("^I create post request to create customer$")
    public void createPostRequest() {
        customerService.createPostRequest();
    }

    @Then("^I get status code (.*) from database$")
    public void verifyStatusCode(int statusCode) {
        customerService.verifyStatusCode(statusCode);
    }

    @And("^response body should contain$")
    public void verifyResponse(List<String> responseMap) {
        customerService.verifyResponse(responseMap);
    }

}
