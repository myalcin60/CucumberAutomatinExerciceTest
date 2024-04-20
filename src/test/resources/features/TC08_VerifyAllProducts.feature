@ProductPage
  Feature: VerifyAllProducts
    Background:
      Given Navigate to url
      And Verify that home page is visible successfully

      Scenario: TC_08
      Given Click on Products button
      And Verify user is navigated to ALL PRODUCTS page successfully
      And The products list is visible
      And Click on View Product of first product
      And User is landed to product detail page
      And Verify that detail detail is visible: product name, category, price, availability, condition, brand
