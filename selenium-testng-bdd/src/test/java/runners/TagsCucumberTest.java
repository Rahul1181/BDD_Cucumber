package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//Tells Junit to use the cucumber test runner instead of default Junit runner
@RunWith(Cucumber.class)  
@CucumberOptions(
    features = "src/test/resources/features", //path of feature file
    glue = {"stepDefinition", "framework.base.HooksExperimental"},
    plugin = {"pretty", "html:target/HtmlReports/cucumber-report.html",
                "json:target/JsonReports/cucumber-report.json",
                "junit:target/JunitReports/cucumber-report.xml"},
    monochrome = true,  //makes console output more readable
    tags = "(@bug or @sprint) or @regression"
)
public class TagsCucumberTest {
    
}


