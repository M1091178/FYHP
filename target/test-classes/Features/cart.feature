Feature: To validate add to cart functionality in FYHP

  @Request
  Scenario: To validate user able to add the product into the cart
    Given To verify user need to be in home page
    When To verify user will click the bestsellers button
    And User will click the product
    And User will increase the quantity of the product
    And User will click add to cart button
    And User click on checkout button
    And User enter the Mandatory details
    Then Click on proceed and proceed to pay

  @Request1
  Scenario: To validate Search functionality with product name
    Given To verify user need to be in home page
    When User will click the Search button and add product name
    And To verify user will click add to cart button
    And User click on checkout button
    And User enter the Mandatory details
    Then Click on proceed and proceed to pay

  @Request2
  Scenario: To validate in cart page user able to delete the product
    Given To verify user need to be in home page
    When User will click the Bath & Shower button
    And User click on add to cart button
    Then User click on delete button

  @Request3
  Scenario: To validate user able to do quiz
    Given To verify user need to be in home page
    And User click on Come Find Yours
    And To verify user will click 1st option
    And To verify user will click 2nd option
    And To verify user will click 3rd option
    And To verify user will click 4th option
    Then Validate the landed page

  @Request4
  Scenario: To Validate user able to Increase and Decrease the quantity of the product
    Given To verify user need to be in home page
    When To verify user able to click Candles button
    And User will click the one of the Candles product
    And User should increase the quantity of the product
    And User will decrease the quantity of the product
    And User will click add to cart button
    And User click on checkout button
    And User enter the Mandatory details
    Then Click on proceed and proceed to pay

  @Request5
  Scenario: To validate user search with Invalid keyword
    Given To verify user need to be in home page
    When User will click the Search button
    And User search with invalid keyword -Toner
    And Validate No reuslt found message displayed or not
