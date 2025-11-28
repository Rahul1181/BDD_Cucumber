package com.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;


public class AutomationExerciseLogin {
    @Given("User navigates to the signup page")
    public void user_navigates_to_the_signup_page() {    
        System.out.println("User is in sign up page");
    }
    @When("User enters valid signup details")
    public void user_enters_valid_signup_signup_details() {
        System.out.println("User enters all required details and clicks on Signup button");
    }
   @And("User submits the signup form")
    public void user_submits_the_signup_form() {
        System.out.println("User successfully signed up");
    }
    @Then("User should receive a confirmation message")
    public void user_should_receive_a_confirmation_message() {
        System.out.println("Confirmation message received");
    }
    
    
}
