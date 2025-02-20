Feature: New LoggedIn View

  Scenario: Validate new user is able to view after clicking on new Registration
    Given User navigates to the Login page
    When User Enter Username&password
    Then User should be able to view the Login details page