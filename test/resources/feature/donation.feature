Feature: verifying all donation amounts

  Background:
    When verify the donation home page comes up

  Scenario: verify all OneTime donation amounts
    And click on One Time button
    Then verify One Time donation amounts are displayed
      | $50 | $75 | $100 | $250 |
    And quit the browser

  Scenario: verify all Monthly donation amounts
    And click on Monthly button
    Then verify Monthly donation amounts are displayed
      | $21 | $50 | $100 | $250 |
    And quit the browser










