Feature: Feature to test Login Functionality

    @login
    Scenario: Check Login is successful with valid Credentials
        Given user in the Login page
        When user enters the username and password
        And user clicks on the submit button
        Then user is redirected to portfolio page

