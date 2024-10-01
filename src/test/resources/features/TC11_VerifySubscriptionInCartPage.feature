@SUBSCRIPTION_CART @SUBSCRIPTION
  Feature: Verify Subscription in Cart page
    Background:
      Given Navigate to url
      And Verify that home page is visible successfully

      Scenario: TC_11
        Given Click Cart button
        And  Scroll down to footer
        And Verify text SUBSCRIPTION
        And Enter email address in input and click arrow button
        Then Verify success message You have been successfully subscribed! is visible