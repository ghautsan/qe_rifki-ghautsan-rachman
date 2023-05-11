Feature: User be able to view detail product
  As user
  I want to view product
  So that I can see the detail

  @detail
  Scenario: As user, I have be able to view detail product
    Given I am on the login page to view detail product
    When I login with registered account
    And I see the home page
    And I click on detail product
    Then I see the product detail