Feature: Login Functionality

  Scenario: Login With Valid Credentials
    Given Browser is opened
    Then Enter User Name and Password
    And click on Login button
    Then Verify Logout button is available

  Scenario: Login With In Valid Credentials
    Given Browser is opened
    Then Enter User Name and Password
    And click on Login button
    Then Verify Logout button is not available
