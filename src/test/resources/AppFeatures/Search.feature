Feature: Amazon Search

@Smoke
Scenario: Search a Product MackBook Air
Given I have a search field on Amazon Page
When I search for a product with a name "Apple MacBook Pro" and price 1000
Then product with name "Apple MacBook Pro" should be displayed 

@Regression
Scenario: Search a Product iPhone
Given I have a search field on Amazon Page
When I search for a product with a name "iPhone" and price 1200
Then product with name "iPhone" should be displayed 
