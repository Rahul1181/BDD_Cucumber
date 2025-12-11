package stepDefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.GoogleSearch;

public class GoogleSearchSteps {
    
    GoogleSearch googleSearch;

    public GoogleSearchSteps(){
        googleSearch = new GoogleSearch();

    }
    @Given("I am on the Google search page")
    public void i_am_on_the_google_search_page() {
        googleSearch.openGooglePage();
    }
    @When("I search for {string}")
    public void i_search_for(String textSearch) {
        googleSearch.searchFor(textSearch);
    }
    @Then("I should see results related to {string}")
    public void i_should_see_results_related_to(String string) {
        googleSearch.checkCaptca();
    }
   
}
