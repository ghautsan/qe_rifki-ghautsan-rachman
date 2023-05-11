@Android
Feature: As an User, I want to success logout, So that I can logout form my account

  @logout
  Scenario: As an User, I can logout
    Given valid user on the home page logout
    When valid user click login link logout
    And valid user input "someone@mail.com" on email field logout
    And valid user input "123123" on password field logout
    And valid user click login button logout
    And valid user on the home page after login
    Then valid user click logout button