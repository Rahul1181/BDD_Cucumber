Feature: Feature to test login Functionality
@regression
    Scenario: Check Login is successful with valid credentials
        Given user is on login page
        And user clicks on signup link and navigates to signup page
        When users enters username and password
        And clicks on login button
        Then user is navigated to MyPortfolio page

    #When we do parameterization, we have to use Scenario Outline
    Scenario:  Check Login is unsuccessful with invalid credentials
        Given user is on login page
        When users enters invalid username1 and password1
        And clicks on login button
        Then error message is displayed
