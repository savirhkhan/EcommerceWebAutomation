Feature: Login functionality scenarios

@Login @one
Scenario: Verify Whether the User is able to login with valid credentials
    Given I launch the application
    And I navigate to Account Login Page
    When I login to application using Username "sh6147782@gmail.com" and Password "testpass"
    Then I should see that user is able to successfully login
    
@Login @two
Scenario: Verify Whether the User is not able to login with invalid credentials
    Given I launch the application
    And I navigate to Account Login Page
    When I login to application using Username "virsa6147782@gmail.com" and Password "testpass1"
    Then I should see that the credentials are invalid
    
@Login @three
Scenario: Verify Whether the User is not able to login without providing credentials
    Given I launch the application
    And I navigate to Account Login Page
    When I login to application using Username "" and Password ""
    Then I should see that the credentials are invalid
    
@Login @four
Scenario: Verify Whether the User is able to reset the forgotton password
    Given I launch the application
    And I navigate to Account Login Page
    When I reset the forgotton password
    Then I should see a message informing the user that information related to resetting password have been send to email addess