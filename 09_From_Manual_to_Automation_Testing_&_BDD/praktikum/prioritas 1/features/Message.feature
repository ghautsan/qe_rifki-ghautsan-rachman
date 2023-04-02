Feature: User be able to send message
  As user
  I want to send message
  So that I can send message with people

  Scenario: As user, I have be able to send message
    Given I am on the home page to send message
    When I click messaging
    And I click person to message
    And I input my message
    Then The message send