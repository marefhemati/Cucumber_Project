@LoginFeature @Regression
Feature: TechFios Billing Login Funtionality Validation  #feature means we start a test souit then we need to write the test case and test case starts with Scenario

@DbScenario1 @Smoke
Scenario: User should be able to login with valid credentials
Given User is on Techfios login page
When User enters "username" from Techfios database
When User enters "password" from Techfios database
When User clicks signin button
Then User should land on dashboard page

