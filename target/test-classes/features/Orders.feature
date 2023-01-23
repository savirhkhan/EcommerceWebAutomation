Feature: End to End Scenario for Placing orders
   
   @Orders @One
   Scenario: Verify whether the user is able to place orders
      Given I login to the application
      When I add a product to bag and check
      And I place an order
      Then I should see the order is placed successfuly
