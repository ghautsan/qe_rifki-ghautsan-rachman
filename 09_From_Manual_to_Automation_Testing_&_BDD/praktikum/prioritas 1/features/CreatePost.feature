Feature: User be able to create post
  As user
  I want to create post
  So that I can post on my feed

  Scenario: As user, I have be able to create post
    Given I am on the home page to create post
    When I click start a post
    And I input my post
    Then The post appear on my feed