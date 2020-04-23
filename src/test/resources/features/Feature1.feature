Feature:Test registration functional

Scenario:Test registration with valid inputs given
Given user launches chrome browser
When user navigates to registration page
And user enters with username as "tomboy"
And user enters with firstname as "aarthi"
And user enters with lastname as "gopi"
And user enters with password as "password123"
And user enters with confirmpassword as "Password123"
And user enters with gender as "female"
And user enters with email as "rthigopikas@gmail.com"
And user enters with mobilenumber as "9840692787"
And user enters with dob as "20/02/1999"
And user enters with address as "perungalathur"
And user enters with Security as "what is your nick name"
And user enters with answer as "chennai"
Then verify registration success