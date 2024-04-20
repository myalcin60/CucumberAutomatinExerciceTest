@SUBSCRIPTION
  Feature: Verify text SUBSCRIPTION
    Background:
      Given Navigate to url
      And Verify that home page is visible successfully

      Scenario: TC_10
      Given Scroll down to footer
      And Verify text SUBSCRIPTION
      And Enter email address in input and click arrow button
      And Verify success message You have been successfully subscribed! is visible