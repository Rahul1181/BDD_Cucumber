package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import framework.base.Hooks;

public class UsefulTipsOnPageFactory {

    WebDriver driver;

    public UsefulTipsOnPageFactory() {
        this.driver = Hooks.getDriver();
        // For Ajax application where timing is the issue
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
    }

    // How to call List of Elements
    @FindBy(partialLinkText = "rahul")
    List<WebElement> links;

    //Find element using How (Old method)
    @FindBy(how = How.XPATH, using = "//input[@id='email']")
    WebElement email;

}
