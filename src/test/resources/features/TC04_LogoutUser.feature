@Logout
Feature: Logout User

  Background:
    Given Navigate to url

  @Logout
  Scenario: TC_04
    Given Verify that home page is visible successfully
    And Click on Signup Login button
    And Verify Login to your account is visible
    And Enter email address and password
    And Click login button
    And Verify that Logged in as username is visible
    And Click Logout button
    Then Verify that user is navigated to login page
    And Close browser