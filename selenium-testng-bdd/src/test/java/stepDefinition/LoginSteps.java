package stepDefinition;

import io.cucumber.java.en.*;
import pageObjects.SignUp;

public class LoginSteps {
    SignUp signUp;
    public LoginSteps(){
        signUp = new SignUp();
    }

    @Given("user is on signUp page")
    public void user_is_on_sign_up_page() {
        signUp.openWebsite();
        
    }
    @When("user fill the personal details")
    public void user_fill_the_personal_details() {
        signUp.signUpUser();
    }

    @Then("user is navigated to MyPortfolio page")
    public void user_is_navigated_to_my_portfolio_page() {
        System.out.println("Error message displayed for invalid credentials");
    }
}