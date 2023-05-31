Feature: User registration

Scenario: User registration with different data set 
	Given User is on registration page 
	When User enters following user details 
	| shradha | automation | shradha@gmail.com | 9873282332 | Coventry |
	| Jane | Dogh | jane@gmail.com | 9873282331 | London |
	| Jonh | Dogh | john@gmail.com | 9873282330 | Lake district |
Then user registration should be successful

Scenario: User registration with different data with column
	Given User is on registration page 
	When User enters following user details with column
	|FirstName | LastName | Email | Phone number | City |
	| shradha | automation | shradha@gmail.com | 9873282332 | Coventry |
	| Jane | Dogh | jane@gmail.com | 9873282331 | London |
	| Jonh | Dogh | john@gmail.com | 9873282330 | Lake district |
Then user registration should be successful
	