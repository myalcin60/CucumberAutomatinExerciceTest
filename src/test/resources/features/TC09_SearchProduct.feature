@ProductPage
  Feature: Search product
    Background:
      Given Navigate to url
      And Verify that home page is visible successfully

      Scenario: TC_09
      Given Click on Products button
      And Verify user is navigated to ALL PRODUCTS page successfully
      And Enter product name in search input and click search button
      And Verify SEARCHED PRODUCTS is visible
      And Verify all the products related to search are visible