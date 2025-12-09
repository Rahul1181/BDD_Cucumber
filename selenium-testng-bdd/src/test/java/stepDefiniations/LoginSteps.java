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
        driver.findElement(By.name("email")).sendKeys("Vijay930@gmail.com");
        driver.findElement(By.className("btn btn-default")).click();
        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("password")).sendKeys("vijayDena@31");
        WebElement days = driver.findElement(By.id("uniform-days"));
        Select select = new Select(days);
        select.selectByValue("21");
        WebElement months =driver.findElement(By.id("uniform-months"));
        Select select1 =new Select(months);




        driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]")).click();
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