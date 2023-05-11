@Android
Feature: As a User, I want to success register, So that I can success login

  @register
  Scenario: As a new User, I have be able to create new account
    Given new user on the home page
    When new user click login link
    And new user click register link
    And new user input full name on fullname field
    And new user input email on email field
    And new user input password on password field
    And new user click register button
    Then new user see home page

  @register-failed
  Scenario: As a new User, I don't be able to create new account
    Given user on the home page
    When user click login link
    And user click register link
    And user input full name on fullname field
    And user input email on email field
    And user input password on password field
    And user click register button
    Then user see error message