package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import framework.base.Hooks;

//Here we are following the POM pattern and not the PageFactory framework
public class GoogleSearch {
    private WebDriver driver;

    public GoogleSearch(){
        this.driver = Hooks.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Locators of the element
    private By text_search = By.id("APjFqb");
    //private By btn_search = By.xpath("(//input[@name='btnK' or @value='Google Search'])[2]");

    public void openGooglePage(){
        // instead of driver.   get() we can also use driver.navigate().to() method because navigation featues(back, forward, refresh) actions
        driver.navigate().to("https://www.google.com/");
    }

    public void searchFor(String textSearch){
        driver.findElement(text_search).sendKeys(textSearch, Keys.ENTER);
    }
    public void checkCaptca(){
        // Check for CAPTCHA presence
        if (!driver.getPageSource().contains("The Witcher 3")) {
           throw new IllegalStateException("CAPTCHA detected. Please complete the CAPTCHA before " + driver.getCurrentUrl());
         }
         // else {
        //     // Check if your content is visible
        //     boolean isVisible = driver.getPageSource("The Witcher 3").contains();
        //     System.out.println("Content visible: " + isVisible);
        // }
    }
    
    
}
