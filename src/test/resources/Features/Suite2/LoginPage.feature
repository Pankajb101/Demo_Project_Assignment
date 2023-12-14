Feature: Login & search page Automation fro Amazon Website

  @Login:
  Scenario: Check Login is successfully done with valid details
    Given User is on Sign In Button
    When User enters valid Email Id
    And Click on Continue Button
    When User enter valid Password
    And User click on Sign Button
    Then User is Navigated to Amazon Home page

  @Search:
   Scenario: Check User Search product successfully
    Given User Click on Search product Box
    When User is Search Iphone Product
    And Click on Search Icon Button
    And User Click on Iphone details
    When User Click on Add to Cart Button
    Then User is landed into add to cart page
