

Feature: userlogin
  


  Scenario: login
    Given user is in signin page 
    And user enterss the username "sanjeevi"
    And user enterss the password "abc123"
    When user clickss login button
    Then user log inn successful
   

 
