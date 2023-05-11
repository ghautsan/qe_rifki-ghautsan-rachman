Feature: User be able to register
  As user
  I want to create account
  So that I can login

  @register
  Scenario: As user, I have be able to success register
    Given I am on the login page to register
    When I click register
    And I input name on name field
    And I input email on email field
    And I input password on password field
    And I click register button
    Then I am back to login page