Feature: Feature to check multiple tags

  Background: User is logged in
    Given user has opened the website
    When user enters username and password
    And hits submit button
    Then user is redirected to the login page

  @regression
  Scenario: This will run during regression
    Given user is working on regression
    When he runs all the regression files
    Then regression is completed

  @sprint
  Scenario: This scenario will run during sprint testing
    Given user is working on sprint
    When he runs all the sprint files
    Then sprint testing is completed

  @story @regression
  Scenario: This scenario will run for both regression and important testing
    Given user is working on new story ticket
    When he executes all the ac for the ticket
    Then ticket is moved to gatekeeping

  @bug @sprint
  Scenario: This will run when important and sprint testing is done
    Given user is working on bug ticket
    When he runs the bug ticket issues
    Then bug ticket is resolved ticket moved to done

# It is not possible to add tags above Background, Given, When, And, Then, But