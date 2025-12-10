package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import framework.base.Hooks;

//Here we add all the UI actions and element locators → Page Object
public class SignUp {
    WebDriver driver;

    public SignUp(){
        this.driver = Hooks.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(name ="name")
    WebElement nameField;

    @FindBy(xpath ="//*[contains(@data-qa,'signup-email')]")
    WebElement emailField;

    @FindBy(xpath = "//*[contains(@data-qa,'signup-button')]")
    WebElement signUpButton;

    @FindBy(id ="id_gender1")
    WebElement maleGender;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id ="days")
    WebElement daysDropDown;

    @FindBy(id ="months")
    WebElement monthsDropDown;

    @FindBy(id ="years")
    WebElement yearsDropDown;

    @FindBy(id ="newsletter")
    WebElement newsLetterCheckBox;

    @FindBy(id ="first_name")
    WebElement firstNameField;

    @FindBy(id ="last_name")
    WebElement lastNameField;

    @FindBy(id ="company")
    WebElement companyNameField;

    @FindBy(id ="address1")
    WebElement addressField;

    @FindBy(id ="state")
    WebElement stateField;

    @FindBy(id ="city")
    WebElement cityField;

    @FindBy(id ="zipcode")
    WebElement zipcodeField;

    @FindBy(id ="mobile_number")
    WebElement mobileNumberField;

    @FindBy(id ="country")
    WebElement countryDropDown;

    @FindBy(xpath ="//*[contains(@data-qa,'create-account')]")
    WebElement createAccountButton;

    @FindBy(xpath = "//*[contains(@data-qa,'continue-button')]")
    WebElement continueButton;

    public void openWebsite(){
        driver.navigate().to("https://automationexercise.com/login");
    }
    public void signUpUser(){
        //Setting up in the SignUp page
        nameField.sendKeys("Vijay");
        emailField.sendKeys("Vijay936@gmail.com");
        signUpButton.click();

        //Creating the Account
        maleGender.click();
        passwordField.sendKeys("vijayDena@31");

        //DropDown menu for DOB
        new Select(daysDropDown).selectByValue("21");
        new Select(monthsDropDown).selectByVisibleText("September");
        new Select(yearsDropDown).selectByValue("1990");

        if(!newsLetterCheckBox.isSelected()){
            newsLetterCheckBox.click();
        }

        //Enter personal Details
        firstNameField.sendKeys("Vijay");
        lastNameField.sendKeys("Mantre");
        companyNameField.sendKeys(("AutomationExercise"));
        addressField.sendKeys("Stree 1 Purohit Nagar");
        stateField.sendKeys("Rajasthan");
        cityField.sendKeys("Janke");
        zipcodeField.sendKeys("824637");
        mobileNumberField.sendKeys(("123456790"));

        //Handle country
        new Select(countryDropDown).selectByValue("Australia");

        //Click on Create Account button
        createAccountButton.click();

        //After successful Verification
        continueButton.click();

    }
    
}
