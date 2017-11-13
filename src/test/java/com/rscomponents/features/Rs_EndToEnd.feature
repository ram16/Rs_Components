Feature: End to End test from Homepage to Check out 
	In order to test End to End Rs Pages 
As a Registered user  
I want to specify the End to End conditions

Background: flow till home page 
	Given user is on Rs homepage 
	When user clicks on Homepage login button 
	Then user is displayed login screen 
	Then user should login to appplication with "Username" and "password"
	
	
Scenario Outline: Select a product and add to basket
	Then should select any Menu "<option>" and click 
	And should select categories "<categories>" displayed 
	And should select SubCategories "<SubCategories>" displayed 
	Then should select "<SubCategories1>" added to basket 
	Then should click Add button 
	Then "item" should added in basket summary 
	Then should click on Checkout 
	
	
Examples: 
|option      |categories|SubCategories         |SubCategories1                     |
|All Products|Batteries |Rechargeable Batteries|AA Rechargeable Batteries          |	