Feature: Test registration functionality

Scenario Outline: login with valid credentials
Given user opens the chrome browser
When user navigates to testme app
And user enters the username as "<username>"
And user enters the password as "<password>"
And user clicks on the submit button

Examples:
#data table -provides different set of test data
|username|password|
|lalitha|Password123|
