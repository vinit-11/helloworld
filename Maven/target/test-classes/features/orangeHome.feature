Feature: My info details

Background: Login to app

Given User is on login page 
When  User enters Username and Password
Then  Click on login button

Scenario: Fill my info details

Given User is on home page 
When  User click on my info
Then  User click on edit button
Then  User clear Fname
Then  User clear lname
Then  User click DOB calender
Then  User click on MONTH
Then  User click on YEAR
Then  User click on DAY
