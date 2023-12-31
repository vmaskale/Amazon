Feature: Login to the Amazon website

Scenario: Login with valid registered number
Given Navigate to the sign in Page
When User enter the mobile number as <7676128811>
And Click on Continue button
Then User should get the Password Page

Scenario: Login with invalid registered number
Given Navigate to the sign in Page
When User enter the mobile number as <7676888811>
And Click on Continue button
Then User should not get the Password Page 
And user should get the warning message as Incorrect phone number