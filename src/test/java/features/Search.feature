Feature: Search Functionality Scenarios

  @Search @one
  Scenario Outline: Verify wheather the user is able to search for the products
       Given I launch the application
       When I search for a product "samsung sync"
       Then I should see the product in the search results
       
  
  
  @Search @two
  Scenario Outline: Verify wheather the user is informed when the product being searched is not available
       Given I launch the application
       When I search for a product "Apple iPhone"
       Then I should see the page displaying the message "There is no product that matches the search criteria."

