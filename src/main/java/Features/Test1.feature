Feature: Login Feature
  Verify if user is able to Login in to the site

  Scenario: Login as a authenticated user
    Given user launches the url
    Then user enters "admin" and "Admin123"
    Then user clicks on Login button
    Then user Selects the login location and then clicks on Login button again
 