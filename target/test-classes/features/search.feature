Feature: Search and place order for vegitables





@SeleniumTest
Scenario Outline: Search for items and validate results
Given User is on the landing page
When searched for "<Name>" vegitable
And Select One Item to cart
And Click on CheckOut
Then Only "<Name>" result is displayed in CheckedOut page

Examples:
|Name|
|Beetroot|
|Brinjal|
|Cucumber|
|Tomato|

@SeleniumTest1
Scenario: Search for items and validate result for new type
Given User is in the landing page
When search for "Tomato" vegitable
And Select the Item to cart
And Click on CheckOut Option
Then Only "Tomato" is displayed in CheckedOut page