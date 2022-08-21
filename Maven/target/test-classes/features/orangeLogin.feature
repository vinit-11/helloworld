Feature: OrangeHRM App Test

Scenario: Login to system

Given User is on login page 
When  User enters Username and Password
Then  Click on login button


Scenario: Home page
Given user is on homepage
When user move on admin
Then user move on job

 
