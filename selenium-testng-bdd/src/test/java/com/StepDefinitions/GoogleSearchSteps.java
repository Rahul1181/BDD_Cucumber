package com.StepDefinitions;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSteps {
    WebDriver driver = null;
    Duration timeout = Duration.ofSeconds(5);
    @Given("I am on the Google search page")
    public void i_am_on_the_google_search_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        //Instead of using deprecated implicitlyWait method 
        // .implicitlyWait(long time, TimeUnit unit); we are using the new method
        //  with Duration becuase of selenium 4 update
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

        // instead of driver.get() we can also use driver.navigate().to() method
        // because navigation featues(back, forward, refresh) actions
        driver.navigate().to("https://www.google.com/");
    }
    @When("I search for {string}")
    public void i_search_for(String string) {
        driver.findElement(By.id("APjFqb")).sendKeys("The Witcher 3");
    }
    @And("I press Enter key")
    public void i_press_enter_key() {
        driver.manage().timeouts().implicitlyWait(timeout);
         driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
    }
    @Then("I should see results related to {string}")
    public void i_should_see_results_related_to(String string) {
        driver.manage().timeouts().implicitlyWait(timeout);

        WebElement checkbox = driver.findElement(By.className("class=\"recaptcha-checkbox-border\""));
        if(!checkbox.isSelected()){
            checkbox.click();
        }
        // Check for CAPTCHA presence
        if (driver.getPageSource().contains("I'm not a robot")) {
            System.out.println("CAPTCHA detected. Test cannot proceed.");
        } else {
            // Check if your content is visible
            boolean isVisible = driver.getPageSource().contains("The Witcher 3");
            System.out.println("Content visible: " + isVisible);
        }
        //driver.quit();
    }
   
}
