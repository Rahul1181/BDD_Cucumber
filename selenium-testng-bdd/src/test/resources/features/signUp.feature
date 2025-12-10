Feature: Feature to test login Functionality

  @regression
  Scenario: Check Login is successful with valid credentials
    Given user is on signUp page
    When user fill the personal details
    Then user is navigated to MyPortfolio page
