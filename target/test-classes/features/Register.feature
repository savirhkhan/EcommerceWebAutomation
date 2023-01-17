Feature: Registration functionality scenarios

@Register
Scenario Outline: Verify whether the user is able to register into the application by providing all the feilds
  Given I launch the application
  And I navigate the accounts registration page
  When  I provide all the below valid details
      | FirstName | Savir 
      | LastName  | Khan  
      | Email     | sh6147782@mail.com
      | Telephone | 7011706837
      | Password  | testpass
      
  And  I select the privacy policy
  And  I click on Continue button
  Then  I should see that the user account has successfully created