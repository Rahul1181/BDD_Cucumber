package framework.base;

import java.time.Duration;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Here we add all Driver initialization
public class Hooks {
    public static WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

    }
    @After
    public void tearDown(){
        if(driver!= null){
            driver.quit();
            driver = null; // Important to avoid stale driver references
        }
    }
    public static WebDriver getDriver() {
        return driver;
    }
    
}
