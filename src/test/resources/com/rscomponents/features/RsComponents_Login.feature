Feature: Login Page
In order to test login page
As a Registered user 
I want to specify the login conditions


Background: flow till home page
Given user is on Rs homepage
When user clicks on Homepage login button
Then user is displayed login screen


# Scenarios can be written Scenario outline with Examples as different inputs 
Scenario: login withvalid username and password
Then user enter valid username "username"
Then user enter valid password "password"
When user clicks on login button
Then user sucessfully login welcome "text"

Scenario: login without username and password
When user clicks on login button
Then user gets ErrorMessage "Message"


Scenario: login invalid username
Then user enter invalid username "username"
When user clicks login button
Then user gets ErrorMessage "Message"



Scenario: login invalid password
Then user enter invalid password "password"
When user clicks login button
Then user gets ErrorMessage "Message"