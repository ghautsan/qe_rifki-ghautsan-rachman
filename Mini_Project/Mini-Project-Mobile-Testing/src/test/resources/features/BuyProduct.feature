@Android
Feature: As an User, I want to success Login, So that I can buy product

  @buy-product
  Scenario: As an User, I can buy product
    Given valid user on the home page buy product
    When valid user click login link buy product
    And valid user input "someone@mail.com" on email field buy product
    And valid user input "123123" on password field buy product
    And valid user click login button buy product
    And user click on some products
    Then number items on cart increase