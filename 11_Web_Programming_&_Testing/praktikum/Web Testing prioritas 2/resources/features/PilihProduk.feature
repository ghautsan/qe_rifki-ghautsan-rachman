Feature: User be able to buy product
  As user
  I want to buy product
  So that I get the buy product

  Scenario: As user, I have be able to buy product
    Given I am on the login page to buy product
    When I input valid email to buy product
    And I input valid password to buy product
    And I click login button to buy product
    And I am on the home page to buy product
    And I Click on pulsa button
    And I fill valid phone number
    Then I choose the product