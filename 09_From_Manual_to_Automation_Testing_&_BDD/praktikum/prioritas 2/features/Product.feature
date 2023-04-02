Feature: User be able to choose product
  As user
  I want to choose product
  So that I can buy product

  Scenario: As user, I have be able choose product
    Given I am on the home page to choose product
    When I click on product
    And I fill the form
    Then I am get the product