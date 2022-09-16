
Feature: Feature to test login functionality

Background:
 
  
    Given user is on login page 
    
    
    
   Scenario Outline: Check Kite_login is sucessful with valid credentials
   
    When user enters <username> and <password>
    
    And click on login button
    
    Then user is navigate to homepage
    
    Then Click on logout button


Examples: 
      | username | password    | 
      | student  | Password123 | 
       



Scenario Outline: Check Kite_login is sucessful with valid credentials
    
   
    When user enters <username> and <password>
    
    And click on login button
    
    Then user is navigate to homepage
    
    Then Click on logout button

  Examples: 
      | username | password    | 
      | student  | Password123 | 