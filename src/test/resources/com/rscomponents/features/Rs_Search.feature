Feature: Search filters 
In order to test search filters 
As a  user 
I want to search filter conditions


Background: flow till home page
Given user is on Rs homepage

Scenario Outline: search with keywords

Then user enter "<Keyword>" in search filter
And user should display "Keyword" page 

Examples:
  |Keyword   |
  |Connectors|
  |Batteries |
  |Fuses     |
  |Pumbling  |


