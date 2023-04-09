Feature: User not be able to login
  As user
  I want to see failed login
  So that I can see the login failed

  Scenario: As user, I have be able to failed login
    Given I am on the login page to failed login
    When I input valid username to failed login
    And I input invalid password
    And I click login button to failed login
    Then I am still on the login page