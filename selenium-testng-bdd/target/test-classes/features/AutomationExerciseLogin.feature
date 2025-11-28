Feature: SignUp and Login Functionality in AutomationExercise Website

  Scenario: Verify that new user can sign up successfully
    Given User navigates to the signup page
    When User enters valid signup details
    And User submits the signup form
    Then User should receive a confirmation message

  Scenario: Verify that existing user can log in successfully
    Given User navigates to the login page
    When User enters valid login credentials
    And User submits the login form
    Then User should be redirected to the dashboard page