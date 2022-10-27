Feature:TryCloud app login feature

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the trycloud login page
   @wip
  Scenario: Login as trycloud
    When user enter trycloud username
    And user enter trycloud password
    Then user see the trycloud dashboard
