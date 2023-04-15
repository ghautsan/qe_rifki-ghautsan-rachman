Feature: User be able to buy product
  As user
  I want to buy product
  So that I get the buy product

  Scenario: As user, I have be able to choose payment method
    Given I am on the login page to choose payment method
    When I input valid email to choose payment method
    And I input valid password to choose payment method
    And I click login button to choose payment method
    And I am on the home page to choose payment method
    And I Click on pulsa button to choose payment method
    And I fill valid phone number to choose payment method
    And I choose the product to choose payment method
    And I choose the payment method
    And I click bayar sekarang
    Then I am on the checkout page