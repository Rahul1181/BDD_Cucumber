package com.StepDefinitions;

import io.cucumber.java.en.*;

public class LoginSteps {

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("Navigating to login page");
    }

    @When("users enters username and password")
    public void users_enters_username_and_password() {
        System.out.println("Entering valid credentials");
    }

    // THIS IS THE EXACT LINE THAT MUST MATCH THE FEATURE FILE
    @When("users enters invalid username1 and password1")
    public void users_enters_invalid_username1_and_password1() {
        System.out.println("Trying invalid login");
        // Your actual code here
    }

    @And("clicks on login button")
    public void clicks_on_login_button() {
        System.out.println("Clicking login button");
    }

    @Then("user is navigated to MyPortfolio page")
    public void user_is_navigated_to_myportfolio_page() {
        System.out.println("Login successful - on MyPortfolio page");
    }

    @Then("error message is displayed")
    public void error_message_is_displayed() {
        System.out.println("Error message displayed for invalid credentials");
    }
}