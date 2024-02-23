@ContactUs
Feature: Contact Us form

  Background:
    Given Navigate to url
    And Verify that home page is visible successfully

  Scenario: TC_06
    And Click on Contact Us button
    And Verify GET IN TOUCH is visible
    And Enter name, email, subject and message
    And Upload file
    And ClickSubmit button
    And Click OK button
    And Verify success message Success! Your details have been submitted successfully. is visible
    And Click Home button
    And verify that landed to home page successfully