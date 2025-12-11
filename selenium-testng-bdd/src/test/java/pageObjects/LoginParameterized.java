package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.base.Hooks;

public class LoginParameterized {
    WebDriver driver;

    public LoginParameterized(){
        this.driver = Hooks.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[contains(@data-qa, 'login-email')]")
    WebElement emailField;

    @FindBy(xpath = "//*[contains(@data-qa, 'login-password')]")
    WebElement passwordField;

    @FindBy(xpath = "//*[contains(@data-qa, 'login-button')]")
    WebElement loginButton;

    public void openWebsite(){
        driver.navigate().to("https://automationexercise.com/login");
    }    
    // User enters the valid credentials
    public void enterCredentials(String username, String password){
        emailField.sendKeys(username);
        passwordField.sendKeys(password);
        
    }
    //User clicks on submit Button
    public void clickSubmitButton(){
        loginButton.click();
    }
    
}
