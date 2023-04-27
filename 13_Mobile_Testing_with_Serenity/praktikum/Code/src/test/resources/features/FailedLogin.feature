@Android
Feature: As a User, I Failed login, So that I cannot login

  @invalid-user
  Scenario: As an User, I cannot Login because wrong email or password
    Given user on the login page
    When user input "rifki@email.com" on email field
    And user input "password" on password field
    And user click login button
    Then user see error message "Wrong Email or Password"