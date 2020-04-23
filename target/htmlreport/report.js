$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Feature1.feature");
formatter.feature({
  "name": "Test registration functional",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test registration with valid inputs given",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user launches chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdef1.user_launches_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to registration page",
  "keyword": "When "
});
formatter.match({
  "location": "stepdef1.user_navigates_to_registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters with username as \"tomboy\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef1.user_enters_with_username_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters with firstname as \"aarthi\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef1.user_enters_with_firstname_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters with lastname as \"gopi\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef1.user_enters_with_lastname_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters with password as \"password123\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef1.user_enters_with_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters with confirmpassword as \"Password123\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef1.user_enters_with_confirmpassword_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters with gender as \"female\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef1.user_enters_with_gender_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters with email as \"rthigopikas@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef1.user_enters_with_email_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters with mobilenumber as \"9840692787\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef1.user_enters_with_mobilenumber_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters with dob as \"20/02/1999\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef1.user_enters_with_dob_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters with address as \"perungalathur\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef1.user_enters_with_address_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters with Security as \"what is your nick name\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef1.user_enters_with_Security_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters with answer as \"chennai\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef1.user_enters_with_answer_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify registration success",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdef1.verify_registration_success()"
});
formatter.result({
  "status": "passed"
});
});