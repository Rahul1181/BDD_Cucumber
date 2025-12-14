package framework.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.AfterStep;

import java.time.Duration;

public class HooksExperimental {
    public static WebDriver driver;

    @Before(order= 1)
    public void setup(){
        System.out.println("We are in the Before setup method");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

    }
    @BeforeStep(order =2)
    public void runStepBefore1(){
        System.out.println("HOOK-BEFORESTEP-1");
    }
    @BeforeStep(order =1)
    public void runStepBefor21(){
        System.out.println("HOOK-BEFORESTEP-2");
    }
    @AfterStep("@regression")
    public void runStepAfter1(){
        System.out.println("HOOK-AFTERSTEP-SPRINT");
    }
    @AfterStep(value = "@bug or @sprint or regression", order =2)
    public void runStepAfter2(){
        System.out.println("HOOK-AFTERSTEP-IMPORTANT");

    }
    @After()
    public void tearDown(){
        System.out.println("Driver will now Quit");
        if(driver != null){
            driver.quit();
            driver = null; // Important to avoid stale driver references
        }
    }
    public static WebDriver getDriver(){
        return driver;
    }


}
