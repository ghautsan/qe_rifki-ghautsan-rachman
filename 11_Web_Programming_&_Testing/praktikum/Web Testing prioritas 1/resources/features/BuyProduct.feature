Feature: User be able to login to buy product
  As user
  I want to buy product
  So that I can get the product

  Scenario: As user, I have be able to buy product
    Given I am on the login page to buy product
    When I input valid username to buy product
    And I input valid password to buy product
    And I click login button to buy product
    And I am on the home page to buy product
    And I click on the product
    And I click on checkout
    And I input valid first name
    And I input valid last name
    And I input valid postal code
    And I click on continue
    And I click on finish
    Then I am on checkout complete page