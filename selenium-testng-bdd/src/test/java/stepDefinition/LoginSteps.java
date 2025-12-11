package stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Login;

public class LoginSteps {

    Login loginObj;

    //Crete the LoginSteps constructor
    public LoginSteps(){
        loginObj = new Login();
    }

    @Given("user in the Login page")
    public void user_in_the_login_page() {
        loginObj.openWebsite();
    }

    @When("user enters the username and password")
    public void user_enters_the_username_and_password() {
        loginObj.enterCredentials();
        
    }

    @And("user clicks on the submit button")
    public void user_clicks_on_the_submit_button() {
        loginObj.clickSubmitButton();
    }

    @Then("user is redirected to portfolio page")
    public void user_is_redirected_to_portfolio_page() {
        System.out.println("Successful Login into Portfolio Page");
    }

}
