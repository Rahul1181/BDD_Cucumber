package com;

import io.cucumber.java.en.*;

public class LoginSteps {
    @Given("user is on login page")
    public void user_is_on_login_page() {
        // implementation
    }

    @When("users enters username and password")
    public void users_enters_username_and_password() {
        // implementation
    }

    @When("users enters invalid {string} and {string}")
    public void users_enters_invalid_and(String username, String password) {
        // implementation
    }

    @And("clicks on login button")
    public void clicks_on_login_button() {
        // implementation
    }

    @Then("user is navigated to MyPortfolio page")
    public void user_is_navigated_to_myportfolio_page() {
        // implementation
    }

    @Then("error message is displayed")
    public void error_message_is_displayed() {
        // implementation
    }
}
