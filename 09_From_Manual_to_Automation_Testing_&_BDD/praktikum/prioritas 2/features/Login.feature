Feature: User be able to login
  As user
  I want to login
  So that I can see home page

  Scenario: As user, I have be able to login
    Given I am on the login page
    When I input valid email
    And I input valid password
    Then I am on the home page