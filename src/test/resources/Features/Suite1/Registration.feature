Feature: Registration page Automation fro Amazon Website

  Scenario: Check Registration is successfully done with valid details
    Given User is on Amazon Home Page
    When User Click on Start here Button
    When User enters valid Your name and Mobile number and Email and Password
    When Click on Verify mobile number Button
    When User enter the OTP
    And User click on Create and new Account Button
    Then User is Navigated to Home page
