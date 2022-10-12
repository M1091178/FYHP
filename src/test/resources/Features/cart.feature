Feature: To validate add to cart functionality in FYHP

  Scenario: To validate user able to add the product into the cart
    Given To verify user need to be in home page
    When To verify user will click the bestsellers button
    And User will click the product
    And User will click add to cart button
    And User will increase the quantity of the product
    And User click on checkout button
    And User enter the Mandatory details
    And Click on proceed
    