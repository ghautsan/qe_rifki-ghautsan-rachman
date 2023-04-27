@Android
Feature: As a User, I input used email, So that I cannot create account

  @failed-register2
  Scenario: As a new User, I cannot create new account with used email
    Given new user on the loginpage to register
    When new user tap register link
    And new user input name on name field to register
    And new user input used email to register
    And new user input password to register
    And new user input confirm password to register
    And new user click register to check
    Then new user see error "Email Already Exists" message