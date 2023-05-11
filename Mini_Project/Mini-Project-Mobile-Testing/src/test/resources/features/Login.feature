@Android
Feature: As an User, I want to success Login, So that I can see my home page

  @login
  Scenario: As an User, I can Login to see home page
    Given valid user on the home page
    When valid user click login link
    And valid user input "someone@mail.com" on email field
    And valid user input "123123" on password field
    And valid user click login button
    Then user see home page

  @login-invalid-account
  Scenario: As an User, I can't Login because invalid account
    Given invalid user on the home page
    When invalid user click login link
    And invalid user input "some0ne@email.com" on email field
    And invalid user input "123123asd" on password field
    And invalid user click login button
    Then user get error message

  @login-wrong-email
  Scenario: As an User, I can't Login because wrong email
    Given user on the home page wrong email
    When user click login link wrong email
    And user input "some0ne@gmail.com" on email field wrong email
    And user input "123123" on password field wrong email
    And user click login button wrong email
    Then user get error message wrong email

  @login-wrong-password
  Scenario: As an User, I can't Login because wrong password
    Given user on the home page wrong password
    When user click login link wrong password
    And user input "someone@mail.com" on email field wrong password
    And user input "123123asd" on password field wrong password
    And user click login button wrong password
    Then user get error message wrong password

  @login-empty-field
  Scenario: As an User, I can't Login because empty fields
    Given user on the home page empty fields
    When user click login link empty fields
    And user click login button empty fields
    Then user get error message empty fields