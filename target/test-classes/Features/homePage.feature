Feature: To validate the home page functionality

  @Validate1
  Scenario: To validate top of the header page and top left SHOP button
    Given User is on home page
    When To verify user mouseover on shop button
    And To Verify user can able to see the categories
    Then Validate the sub categories

    @Validate1
    Scenario: To Validate user able to add the product to the cart
    Given User need to be in home page
    When User able to select th
   