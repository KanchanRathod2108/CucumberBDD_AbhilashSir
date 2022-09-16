

Feature: Feature to test login functionality

 @tag
  Scenario Outline: Check login is sucessful with valid credentials
    Given user is on login page
   
    When user enters <username> and <password>
    
    And click on login button
    
    Then user is navigate to homepage
    
    Then Click on logout button


Examples: 
      | username | password    | 
      | student  | Password123 | 
       

@smoke

Scenario Outline: Check login is sucessful with valid credentials
    Given user is on login page
   
    When user enters <username> and <password>
    
    And click on login button
    
    Then user is navigate to homepage
    
    Then Click on logout button

  Examples: 
      | username | password    | 
      | student  | Password123 | 