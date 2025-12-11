Feature: Feature to test Login Functionality using Data Parameterization & Data Driven Testing

  @loginParameterized
  # Whenever we use data param. we must change scenario to scenario Outline
  Scenario Outline: Check Login is successful with valid Credentials
    Given user in the Login page of website
    When user enters the <username> and <password>
    And user clicks on submit button
    Then user lands on the portfolio page

    Examples:
      | username           | password     |
      | Vijay938@gmail.com | vijayDena@31 |
      | Vijay937@gmail.com | vijayDena@31 |