@LoginFeature @Regression
Feature: TechFios Billing Login Funtionality Validation  #feature means we start a test souit then we need to write the test case and test case starts with Scenario

@Scenario1 @Smoke
Scenario: User should be able to login with valid credentials
Given User is on Techfios login page
When User enters username as "demo@techfios.com"
When User enters password as "abc123"
When User clicks signin button
Then User should land on dashboard page

@Scenario2
Scenario: User should not be able to login invalid credentials #Here we already created the steps we don't need to create another in LoginStepDefination class
Given User is on Techfios login page
When User enters "username"
When User enters "password"
When User clicks signin button
Then User should land on dashboard page