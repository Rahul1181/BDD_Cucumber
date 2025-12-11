package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework.base.Hooks;

public class Login {
    WebDriver driver;

    public Login(){
        this.driver = Hooks.getDriver();
        PageFactory.initElements(driver, this);  //Instead of this we can write "Login.class"
    }

    @FindBy(xpath = "//*[contains(@data-qa, 'login-email')]")
    @CacheLookup    // This will cache the element in memory and not search for it again
    WebElement emailField;

    @FindBy(xpath = "//*[contains(@data-qa, 'login-password')]")
    @CacheLookup
    WebElement passwordField;

    @FindBy(xpath = "//*[contains(@data-qa, 'login-button')]")
    @CacheLookup
    WebElement loginButton;

    public void openWebsite(){
        driver.navigate().to("https://automationexercise.com/login");
    }    
    // User enters the valid credentials
    public void enterCredentials(){
        emailField.sendKeys("Vijay938@gmail.com");
        passwordField.sendKeys("vijayDena@31");
        
    }
    //User clicks on submit Button
    public void clickSubmitButton(){
        loginButton.click();
    }
}
