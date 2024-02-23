@LoginUser
  Feature: Login
    Background: 
      Given Navigate to url
    
    @NegativeSignup
    Scenario: TC_02
    Given Verify that home page is visible successfully
    And Click on Signup Login button
    And Verify New User Signup! is visible
    And Enter name and already registered email address
    And Click Signup button
    And Verify error Email Address already exist! is visible
    And Close browser

      @NegativeLogin
      Scenario: TC_03
      Given Verify that home page is visible successfully
      And Click on Signup Login button
      And Verify Login to your account is visible
      And Enter incorrect email address and password
      And Click login button
      And Verify error Your email or password is incorrect! is visible

      