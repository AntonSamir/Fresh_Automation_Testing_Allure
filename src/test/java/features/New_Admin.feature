
  Feature: Admin View

    Scenario: Validate user is able to view after Login
      Given User navigates to the Admin page
      When navigates to Admin
      And navigates to Add new Admin
      Then navigates to Search and Delete new Admin
