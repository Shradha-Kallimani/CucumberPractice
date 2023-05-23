
@All
Feature: User Booking Feature

@Smoke
Scenario: Booking Cab Sedan
Given User wants to select a car type "Sedan" from Uber app 
When User selects "Sedan" and pick-up location as "London" and drop location "Scottland"
Then Driver starts the journey 
And Driver ends the journey 
Then User pays 1000 pounds 

@Regression
Scenario: Booking Cab SUV
Given User wants to select a car type "SUV" from Uber app 
When User selects "SUV" and pick-up location as "London" and drop location "Coventry"
Then Driver starts the journey 
And Driver ends the journey 
Then User pays 1200 pounds 

@Prod
Scenario: Booking Cab Mini
Given User wants to select a car type "Mini" from Uber app 
When User selects "Mini" and pick-up location as "Coventry" and drop location "Birmingham"
Then Driver starts the journey 
And Driver ends the journey 
Then User pays 50 pounds  
