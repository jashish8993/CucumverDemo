Feature: Registration Test2
  Verify if user is able to Login in to the site
@Sanity
  Scenario: Login as a authenticated user with Datatable
    Given users launches the url
    Then user enter "admin" and "Admin123"
    Then user click on Login button
    Then user Select the login location and then clicks on Login button again

@First
   Scenario: Register a user with Datatable
    Given User click on Register a HSu button
    Then User enter name in Firstname and Lastname field
    | Test | User3 |
    Then user select Gender
    Then user click on Confirm Tab
    Then user click on Confirm button
    Then go to the Homepage
    
   