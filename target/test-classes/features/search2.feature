Feature: Search and place order for vegitables



@SeleniumTest1
Scenario: Search for items and validate result for new type
Given User is in the landing page
When search for "Tomato" vegitable
And Select the Item to cart
And Click on CheckOut Option
Then Only "Tomato" is displayed in CheckedOut page


