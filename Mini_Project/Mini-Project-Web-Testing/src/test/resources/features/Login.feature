Feature: User be able to login
  As user
  I want to login
  So that I can see home page

  @login
  Scenario: As user, I have be able to success login
    Given I am on the login page
    When I input email
    And I input password
    And I click login
    Then I am on the home page

  @invalid-account
  Scenario: As user, I have be able to failed login because account not registered
    Given I am on the login page invalid account
    When I input email invalid account
    And I input password invalid account
    And I click login invalid account
    Then I am on the home page invalid account

  @wrong-email
  Scenario: As user, I have be able to failed login because wrong email
    Given I am on the login page wrong email
    When I input email wrong email
    And I input password wrong email
    And I click login wrong email
    Then I am on the home page wrong email

  @wrong-password
  Scenario: As user, I have be able to failed login because wrong password
    Given I am on the login page wrong password
    When I input email wrong password
    And I input password wrong password
    And I click login wrong password
    Then I am on the home page wrong password

  @all-fields-empty
  Scenario: As user, I have be able to failed login because email and password field empty
    Given I am on the login page email and password field empty
    When I input email email and password field empty
    And I input password email and password field empty
    And I click login email and password field empty
    Then I am on the home page email and password field empty