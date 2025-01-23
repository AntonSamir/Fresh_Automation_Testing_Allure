@allure.label.epic:Web
Feature: General View

  Scenario: Validate general user is able to view products wihtout logging in
    Given User navigates to the Online products page
    When User clicks on Offer
    Then User should be able to view the Products