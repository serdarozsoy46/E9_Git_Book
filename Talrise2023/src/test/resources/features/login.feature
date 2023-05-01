Feature: Login


  Scenario:  User should be login with valid information
    Given User makes request for login with valid information
    Then verify login with status code 200