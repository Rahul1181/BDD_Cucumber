package runners;

// We need Runner class to run the feature file with more Options
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//Tells Junit to use the cucumber test runner instead of default Junit runner
@RunWith(Cucumber.class)  
@CucumberOptions(
    features = "src/test/resources/features", //path of feature file
    glue = {"stepDefinition", "framework.base"},
    plugin = {"pretty", "html:target/HtmlReports/cucumber-report.html",
                "json:target/JsonReports/cucumber-report.json",
                "junit:target/JunitReports/cucumber-report.xml"},
    monochrome = true,  //makes console output more readable
    tags = "@SearchText"
    //tags = "@loginParameterized"
    //tags = "@login"
    //tags = "@signup"
)
public class RunCucumberTest {
    
}

/*
package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/login.feature",
        glue = {"stepDefinition", "framework.base"},
        plugin = {
                "pretty",
                "html:target/HtmlReports/cucumber-report.html",
                "json:target/JsonReports/cucumber-report.json",
                "junit:target/JunitReports/cucumber-report.xml"
        },
        monochrome = true,
        tags = "@regression"
)
public class RunCucumberTest extends AbstractTestNGCucumberTests {
    // This class must extend AbstractTestNGCucumberTests to run with TestNG
}
 */