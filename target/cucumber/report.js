$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("search.feature");
formatter.feature({
  "line": 1,
  "name": "Search and place order for vegitables",
  "description": "",
  "id": "search-and-place-order-for-vegitables",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13992861392,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Search for items and validate result for new type",
  "description": "",
  "id": "search-and-place-order-for-vegitables;search-for-items-and-validate-result-for-new-type",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@SeleniumTest1"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "User is in the landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "search for \"Tomato\" vegitable",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "Select the Item to cart",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Click on CheckOut Option",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Only \"Tomato\" is displayed in CheckedOut page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefinations.user_is_in_the_landing_page()"
});
formatter.result({
  "duration": 165255819,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tomato",
      "offset": 12
    }
  ],
  "location": "MyStepDefinations.search_for_something_vegitable(String)"
});
formatter.result({
  "duration": 3745354342,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefinations.select_the_item_to_cart()"
});
formatter.result({
  "duration": 528569828,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefinations.click_on_checkout_option()"
});
formatter.result({
  "duration": 2106829917,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tomato",
      "offset": 6
    }
  ],
  "location": "MyStepDefinations.only_something_is_displayed_in_checkedout_page(String)"
});
formatter.result({
  "duration": 2184508876,
  "status": "passed"
});
formatter.after({
  "duration": 988145427,
  "status": "passed"
});
formatter.uri("search2.feature");
formatter.feature({
  "line": 1,
  "name": "Search and place order for vegitables",
  "description": "",
  "id": "search-and-place-order-for-vegitables",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12616644682,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Search for items and validate result for new type",
  "description": "",
  "id": "search-and-place-order-for-vegitables;search-for-items-and-validate-result-for-new-type",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@SeleniumTest1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User is in the landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "search for \"Tomato\" vegitable",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Select the Item to cart",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click on CheckOut Option",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Only \"Tomato\" is displayed in CheckedOut page",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefinations.user_is_in_the_landing_page()"
});
formatter.result({
  "duration": 106332,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tomato",
      "offset": 12
    }
  ],
  "location": "MyStepDefinations.search_for_something_vegitable(String)"
});
formatter.result({
  "duration": 3314480561,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefinations.select_the_item_to_cart()"
});
formatter.result({
  "duration": 4098463770,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefinations.click_on_checkout_option()"
});
formatter.result({
  "duration": 2147230300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tomato",
      "offset": 6
    }
  ],
  "location": "MyStepDefinations.only_something_is_displayed_in_checkedout_page(String)"
});
formatter.result({
  "duration": 2234711912,
  "status": "passed"
});
formatter.after({
  "duration": 806553085,
  "status": "passed"
});
});