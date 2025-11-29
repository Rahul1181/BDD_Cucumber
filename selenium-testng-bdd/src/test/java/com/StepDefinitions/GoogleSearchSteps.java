package com.StepDefinitions;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSteps {
    WebDriver driver = null;

    @Given("I am on the Google search page")
    public void i_am_on_the_google_search_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //Instead of using deprecated implicitlyWait method 
        // .implicitlyWait(long time, TimeUnit unit); we are using the new method
        //  with Duration becuase of selenium 4 update
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }
    @When("I search for {string}")
    public void i_search_for(String string) {
        System.out.println("User searches for The Witcher 3");
    }
    @And("I press Enter key")
    public void i_press_enter_key() {
        System.out.println("User presses Enter key");
    }
    @Then("I should see results related to {string}")
    public void i_should_see_results_related_to(String string) {
        System.out.println("Search results related to The Witcher 3 are displayed");
    }
   
}
