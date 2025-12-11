package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LoginParameterized;
import io.cucumber.java.en.Then;


public class DataParameterizationLogin {
    LoginParameterized loginObj;

    //Crete the LoginSteps constructor
    public DataParameterizationLogin(){
        loginObj = new LoginParameterized();
    }

    @Given("user in the Login page of website")
    public void user_in_the_login_page_of_website() {
        loginObj.openWebsite();
    }

    @When("^user enters the (.*) and (.*)$")
    public void user_enters_the_username_and_password(String username, String password) {
        loginObj.enterCredentials(username, password);
        
    }

    @And("user clicks on submit button")
    public void user_clicks_on_submit_button() {
        loginObj.clickSubmitButton();
    }

    @Then("user lands on the portfolio page")
    public void user_lands_on_the_portfolio_page() {
        System.out.println("Successful Login into Portfolio Page");
    }

    
    
}
