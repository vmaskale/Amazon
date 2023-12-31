Feature: Login to the Amazon website

Scenario: Login with valid Password
Given Navigate to the password page
When User enter the Password as <Mona@1998>
And Click on Signin button
Then User should Successfully able to login to the website

Scenario: Login with invalid Password
Given Navigate to the password page
When User enter the Password as <Mona.1998>
And Click on Signin button
Then User should not Successfully able to login to the website
And User should get the Warning Message as There was a problem  Your password is incorrect