Feature: User be able to choose payment method
  As user
  I want to choose payment method
  So that I can buy product

  Scenario: As user, I have be able choose payment method
    Given I am on the payment page
    When I fill the form to make payment
    And I choose payment method
    Then I click Bayar Sekarang