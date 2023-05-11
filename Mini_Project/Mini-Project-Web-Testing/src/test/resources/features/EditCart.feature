Feature: User be able to edit cart
  As user
  I want to edit cart
  So that I can manage my cart

  @edit-cart-plus
  Scenario: As user, I have be able to edit cart plus
    Given I am on the login page to edit cart
    When I login with registered account to edit cart
    And I see the home page to edit cart
    And I click beli on some product
    And I click on cart icon to see products
    And I click on plus button on products
    Then I check total products

  @edit-cart-minus
  Scenario: As user, I have be able to edit cart minus
    Given I am on the login page to edit cart minus
    When I login with registered account to edit cart minus
    And I see the home page to edit cart minus
    And I click beli on some product minus
    And I click on cart icon to see products minus
    And I click on minus button on products
    Then I check total products minus