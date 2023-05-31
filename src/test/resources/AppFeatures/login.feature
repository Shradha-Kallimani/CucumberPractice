Feature: Login feature

Scenario Outline: Login Fail - possible combinations 
Given user is on application landing page 
When user clicks on sign in button 
Then user navigates to login screen 
When user enters "<UserName>" in username field 
And user enters "<Password>" in password field
And user clicks sign in button
Then user gets login fails error message 

		Examples:
		| UserName 								| Password					|
		| incorrect username 			| 12345							|
		| shradha 								| incorrect password|
		| incorrect username 			| incorrect password|
