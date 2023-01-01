@CLOUD-1444
Feature: Log out



 @CLOUD-1442
  Scenario: user login tryCloud with login button
   Given user is on the tryCloud login page
   When user enters username "Employee53"
   And user enters password "Employee123"
   Then user clicks to login Button
   Then user should see dashboard
    And user enters personal info box
    Then user click to log out button
    Then user should see tryCloud page

 @CLOUD-1443
    Scenario:
   Given user is on the tryCloud login page
   When user enters username "Employee53"
   And user enters password "Employee123"
   Then user clicks to login Button
   Then user should see dashboard
    And user enters personal info box
    Then user click to log out button
    Then user should see tryCloud page
    And user see fields
