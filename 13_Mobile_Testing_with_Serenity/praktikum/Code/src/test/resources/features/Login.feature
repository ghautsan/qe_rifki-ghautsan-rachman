@Android
Feature: As an User, I want to success Login, So that I can see my home page

  @login
  Scenario: As an User, I can Login to see home page
    Given valid user on the login page
    When valid user input "rifki@gmail.com" on email field
    And valid user input "123" on password field
    And valid user click login button
    Then user see home page

