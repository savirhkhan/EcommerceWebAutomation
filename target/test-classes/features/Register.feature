Feature: Registration functionality scenarios

@Register @one
Scenario Outline: Verify whether the user is able to register into the application by providing all the feilds
  Given I launch the application
  And I navigate the accounts registration page
  When  I provide all the below valid details
      | FirstName | Savir | 
      | LastName  | Khan  |
      | Email     | sh26147782@mail.com |
      | Telephone | 7011706837 |
      | Password  | testpass   |
      
  And  I select the privacy policy
  And  I click on Continue button
  Then  I should see that the user account has successfully created
  
@Register @two
Scenario Outline: Verify whether the user is not allowed to register on skipping mandatory fields
  Given I launch the application
  And I navigate the accounts registration page
  When  I click on Continue button
  Then  I should see that the user account is not created
  And I should see the error message inorming the user to fill the mandatory fields
  
  
@Register @three
Scenario Outline: Verify whether the user is able to register into the application by opting NewsLetter subscription
  Given I launch the application
  And I navigate the accounts registration page
  When  I provide all the below valid details
      | FirstName | Savir | 
      | LastName  | Khan  |
      | Email     | sh86147782@mail.com |
      | Telephone | 7011706837 |
      | Password  | testpass   |
  And I subscribe to Newsletter    
  And  I select the privacy policy
  And  I click on Continue button
  Then  I should see that the user account has successfully created  
  
  
@Register @four
Scenario Outline: Verify whether the user is ristricted from creating a duplicate account
  Given I launch the application
  And I navigate the accounts registration page
  When  I provide all the below dupplicate details
      | FirstName | Savir | 
      | LastName  | Khan  |
      | Email     | sh6147782@mail.com |
      | Telephone | 7011706837 |
      | Password  | testpass   |  
  And  I select the privacy policy
  And  I click on Continue button
  Then  I should see that the user is ristricted from creating duplicate account
 
 