
Feature: tryCloud login test


Background: User is expected to be login page
 Given user is on the tryCloud login page

@CLOUD-1329
Scenario: user login tryCloud with login button
When user enters username "Employee53"
And user enters password "Employee123"
Then user clicks to login Button
Then user should see dashboard

@CLOUD-1330
 Scenario Outline:a:User can not login with any invalid credentials and see this message "Wrong username or password."
  Given user is on the tryCloud login page
  When  user enters "<username>" and "<password>"
  And user clicks to login Button
  Then user should see this message "Wrong username or password."

  Examples:
   |username   |password    |
   |Employee13 |employee123 |
   |employee1. |Employee123 |
   |Employee53*|Employee12  |
   |Employe23  |employee1   |

@CLOUD-1331
 Scenario Outline:b:User can not login with any empty credentials and see this message "Please fill out this field"
  Given user is on the tryCloud login page
  When  user enters "<username>" and "<password>"
  And user clicks to login Button
  Then user should see this message in box "Please fill out this field"

  Examples:
   |username    |password   |
   |Employee13  |           |
   |            |Employee123|


@CLOUD-1421
Scenario: User can see the password in a form of dots by default?
Given user is on the tryCloud login page
When  user enters "<username>" and "<password>"
Then user see password dots form

@CLOUD-1422
Scenario: User can see the password explicitly if needed
Given user is on the tryCloud login page
When  user enters"<password>"
And user click to eye sign
Then user see password explicitly

@CLOUD-1423
Scenario: User can see the "Forgot password?" link on the login page and can see the "Reset Password"
button on the next page after clicking on forget password link
Given user is on the tryCloud login page
When user clicks Forgot password on login page
Then user see Reset Password on the dashbord


@CLOUD-1424
Scenario:User can see valid placeholders on Username and Password fields
Given user is on the tryCloud login page
And user see fields

