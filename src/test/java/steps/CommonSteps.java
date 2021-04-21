package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CommonSteps {

    @Given("today is (.*)")
    public void today_is_Friday(String day) {
        System.out.println(day);
    }

    @When("I ask whether its Friday yet")
    public void i_ask_whether_its_Friday_yet() {
        System.out.println("I ask whether its Friday yet");
    }

    @Then("i should be told (.*)")
    public void i_should_be_told_TGIF(String isItFriday) {
        System.out.println(isItFriday);
    }
}
