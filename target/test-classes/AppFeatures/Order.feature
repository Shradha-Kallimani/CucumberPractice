
Feature: Amazon Orger page
	In order to check my order details 
	As a registered user 
	I want to specify the features of order details page 
	
Background: 
Given a registered user exists 
Given User is on Amazon Login page 
When User enters Username 
And User enters Password 
And User clicks on Login button
Then User navigates to Order page 

Scenario: Check Previous order details 
When User clicks on Order link
Then User checks the previous orders details

Scenario: Check Open order details 
When User clicks on Open Order link
Then User checks the Open orders details

Scenario: Check Cancelled order details 
When User clicks on Cancelled Order link
Then User checks the cancelled orders details

