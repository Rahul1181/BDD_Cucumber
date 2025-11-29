Feature: Feature to test Google Search Functionality

Background: User opens the browser and open the search engine
    Given I am on the Google search page

@SmokeTest
Scenario: Search game in the Google search engine
    When I search for "The Witcher 3"
    And I press Enter key
    Then I should see results related to "The Witcher 3"