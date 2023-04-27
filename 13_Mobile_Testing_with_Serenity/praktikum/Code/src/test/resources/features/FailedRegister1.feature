@Android
Feature: As a User, I input wrong confirm password, So that I cannot create account

  @failed-register1
  Scenario: As a new User, I cannot create new account with different confirm password
    Given new user on the login page to register
    When new user click register link to register
    And new user input name
    And new user input email
    And new user input password
    And new user input wrong confirm password
    And new user click register button to check
    Then new user see failed message