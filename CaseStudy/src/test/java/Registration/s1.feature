Feature: TestMeApplication 

Scenario: Registration
    Given opens the TestMeApp homepage 
    And user clicks signup button
    And username "sanjeevi"
    And firstname "sanjeevi"
    And lastname "murali"
    And password "abc123"
    And confirmpassword "abc123" 
    And gender "male"
    And email "sanjeevi@gmail.com"
    And number "1236547890"
    And dob "14/07/1997"
    And address "coimbatore"
    And securityquestion 
    And answer 
    When click button register
    Then user redirected to the login page

  