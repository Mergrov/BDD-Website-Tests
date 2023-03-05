Feature: buying a product

  Scenario: Buying a sweater
    Given The user is logged in
    When The product is selected and added to the cart
    Then The product can be purchased

