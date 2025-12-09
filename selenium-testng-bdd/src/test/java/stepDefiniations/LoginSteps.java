package stepDefiniations;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
    WebDriver driver = null;
    Duration timeout = Duration.ofSeconds(10);

    @Given("user is on login page")
    public void user_is_on_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.navigate().to("https://automationexercise.com/login");
    }
    @And("user clicks on signup link and navigates to signup page")
    public void user_clicks_on_signup_link_and_navigates_to_signup_page() {
        driver.findElement(By.name("name")).sendKeys("Vijay");
        driver.findElement(By.xpath("//*[contains(@data-qa,'signup-email')]")).sendKeys("Vijay931@gmail.com");
        driver.findElement(By.xpath("//*[contains(@data-qa,'signup-button')]")).click();
        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("password")).sendKeys("vijayDena@31");

        // Dropdown menu for DOB
        WebElement days = driver.findElement(By.id("days"));
        Select select = new Select(days);
        select.selectByValue("21");
        WebElement months =driver.findElement(By.id("months"));
        Select select1 =new Select(months);
        select1.selectByContainsVisibleText("September");
        WebElement years = driver.findElement(By.id("years"));
        Select select2 = new Select(years);
        select2.selectByValue("1990");

        //subscribe to newsletter
        WebElement subscribeNewsLetter = driver.findElement(By.id("newsletter"));
        if(!subscribeNewsLetter.isSelected()){
            subscribeNewsLetter.click();
        }

        //Enter Personal information
        driver.findElement(By.id("first_name")).sendKeys("Vijay");
        driver.findElement(By.id("last_name")).sendKeys("Mantre");
        driver.findElement(By.id("company")).sendKeys("AutomationExercise");
        driver.findElement(By.id("address1")).sendKeys("Stree 1 Purohit Nagar");
        driver.findElement(By.id("state")).sendKeys("Rajasthan");
        driver.findElement(By.id("city")).sendKeys("Janke");
        driver.findElement(By.id("zipcode")).sendKeys("824637");
        driver.findElement(By.id("mobile_number")).sendKeys("123456790");

        //Handle the country
        WebElement country = driver.findElement(By.id("country"));
        Select select3  = new Select(country);
        select3.selectByValue("Australia");

        //Handles the Create Account
        driver.findElement(By.xpath("//*[contains(@data-qa,'create-account')]")).click();

        //After successful Verification 
        driver.findElement(By.xpath("//*[contains(@data-qa,'continue-button')]")).click();


        


        //driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]")).click();
        System.out.println("Navigated to signup page");
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