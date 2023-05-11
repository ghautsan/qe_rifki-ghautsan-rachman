Feature: User be able to payment
  As user
  I want to payment
  So that I can buy product

  @payment
  Scenario: As user, I have be able to payment
    Given I am on the login page to pay
    When I login with registered account to pay
    And I see the home page to pay
    And I click beli on product
    And I click on cart icon
    And I click on bayar button
    Then I see the transaction page