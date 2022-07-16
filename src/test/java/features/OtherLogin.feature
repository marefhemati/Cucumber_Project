@OtherLoginFeature @Regression
Feature: Other Login Funtionality Validation  //feature means we start a test souit then we need to write the test case and test case starts with Scenario

#if we have repeated of this there if we use Backgroud: then it will do it for all other scenario below is formula
Background:   
Given User is on Techfios login page  

#if we have use data driven below is formul for that  
@OrhweScenario1
Scenario Outline: User should be able to login with valid credentials (other Scenario)
#Given User is on Techfios login page
When User enters username as "<username>"
When User enters password as "<password>"
When User clicks signin button
Then User should land on dashboard page

Examples:
|username|password|
|demo@techfios.com|abc123|
|demo2@techfios.com|abc123|
|demo@techfios.com|abc1234|

