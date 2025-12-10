Feature: Feature to test signUp Functionality

  @signup
  Scenario: Check Signup is successful with valid credentials
    Given user is on signUp page
    When user fill the personal details
    Then user is navigated to MyPortfolio page
