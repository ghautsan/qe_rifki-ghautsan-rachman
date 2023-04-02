Feature: User be able to react to post
  As user
  I want to react to post
  So that I can communicate with people

  Scenario: As user, I have be able to react to post
    Given I am on the home page to rect post
    When I click someone post
    And I react to someone post
    Then My reaction appear on their post