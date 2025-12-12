Feature: Feature to check multiple tags

    @regression
    Scenario: This will run during regression
        Given
        When
        Then

    @sprint
    Scenario: This scenario will run during sprint testing
        Given
        When
        Then

    @important
    Scenario: This scenario will run for both regression and sprint testing
        Given
        When
        Then

    @important @sprint
    Scenario: This will run when important and sprint testing is done
        Given
        When
        Then


 # It is not possible to add tags above Background, Given, When, And, Then, But