$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TechFiosLoginUseDataFromDatabase.feature");
formatter.feature({
  "line": 2,
  "name": "TechFios Billing Login Funtionality Validation  #feature means we start a test souit then we need to write the test case and test case starts with Scenario",
  "description": "",
  "id": "techfios-billing-login-funtionality-validation--#feature-means-we-start-a-test-souit-then-we-need-to-write-the-test-case-and-test-case-starts-with-scenario",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginFeature"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 1845317700,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should be able to login with valid credentials",
  "description": "",
  "id": "techfios-billing-login-funtionality-validation--#feature-means-we-start-a-test-souit-then-we-need-to-write-the-test-case-and-test-case-starts-with-scenario;user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@DbScenario1"
    },
    {
      "line": 4,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on Techfios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User enters \"username\" from Techfios database",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User enters \"password\" from Techfios database",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User clicks signin button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.user_is_on_techfios_login_page()"
});
formatter.result({
  "duration": 1521170100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 13
    }
  ],
  "location": "LoginStepDefination.user_enters_from_Techfios_database(String)"
});
formatter.result({
  "duration": 3091657900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 13
    }
  ],
  "location": "LoginStepDefination.user_enters_from_Techfios_database(String)"
});
formatter.result({
  "duration": 3081421900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_clicks_signin_button()"
});
formatter.result({
  "duration": 5825983000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_should_land_on_dashboard_page()"
});
formatter.result({
  "duration": 13537100,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[Dashboard]- iBilling\u003e but was:\u003c[Login ]- iBilling\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat steps.LoginStepDefination.user_should_land_on_dashboard_page(LoginStepDefination.java:90)\r\n\tat ✽.Then User should land on dashboard page(features/TechFiosLoginUseDataFromDatabase.feature:10)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 688331200,
  "status": "passed"
});
});