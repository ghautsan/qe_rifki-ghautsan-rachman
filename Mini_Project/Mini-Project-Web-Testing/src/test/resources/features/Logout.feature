Feature: User be able to logout
  As user
  I want to login then logout
  So that I can logout

  @logout
  Scenario: As user, I have be able to logout
    Given I am on the login page to test logout
    When I input email to login
    And I input password to login
    And I click login to test logout
    And I click profile icon
    And I click logout
    Then I am back on the login page