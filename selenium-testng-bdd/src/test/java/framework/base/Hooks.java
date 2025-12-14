package framework.base;

import java.time.Duration;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.BeforeStep;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//Hooks are the block of Code which runs before and after every scenario (They are listners similar to TestNG)
public class Hooks {
    private static WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();   //"WebDriver Manager, get the Chrome driver, and set it up.
        driver = new ChromeDriver();
        
        //Instead of using deprecated implicitlyWait method 
        // .implicitlyWait(long time, TimeUnit unit); we are using the new method
        //  with Duration becuase of selenium 4 update
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();  //"Hey computer operator (driver), let me access the control panel (manage), specifically the window settings (window), and make it full screen (maximize)."

    }
    @After
    public void tearDown(){
        if(driver!= null){
            driver.quit();
            driver = null; // Important to avoid stale driver references
        }
    }
//    @BeforeStep(order =1)
//    public void afterEachStep(){
//        System.out.println("Run it Before every feature file steps");
//    }
    public static WebDriver getDriver() {
        return driver;
    }

    
}

//Order works in reverse sequence in case of @After annotations and we can use tags like @Before(