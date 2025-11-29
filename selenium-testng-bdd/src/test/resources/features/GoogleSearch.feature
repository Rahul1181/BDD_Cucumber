Feature:Feature to test Google Search Functionality
    Scenario: Search game in the Google search engine
        Given I am on the Google search page
        When I search for "The Witcher 3"
        Then I should see results related to "The Witcher 3"