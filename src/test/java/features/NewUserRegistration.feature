Feature: New User Registration View

  Scenario: Validate new user is able to view after clicking on new Registration
    Given User navigates to the Signin page
    When User Enter Email&password
    Then User should be able to view the Registration page