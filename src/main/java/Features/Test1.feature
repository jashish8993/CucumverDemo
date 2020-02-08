Feature: Login Feature in Test1
  Verify if user is able to Login in to the site
@Smoke
  Scenario: Login as a authenticated user
    Given user launches the url
    Then user enters "admin" and "Admin123"
    Then user clicks on Login button
    Then user Selects the login location and then clicks on Login button again

 @Smoke
   Scenario Outline: Register a user
    Given User clicks on Register a HSu button
    Then User enters name in "<Given>" and "<Family_name>" field
    Then user selects Gender
    Then user clicks on Confirm Tab
    Then user clicks on Confirm button
    Then go to Homepage
    
  Examples:
   | Given | Family_name |
   | Test  | User1       | 