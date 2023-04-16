Feature: User
  As an user
  I want to see product
  So that I can buy product

  Scenario: POST - As user I have be able to login
    Given I set POST api endpoints
    When I send POST HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for login

  Scenario: GET - As user I have be able to get all products
    Given I set GET api endpoints
    When I send GET HTTP request

  Scenario: PUT - As admin I have be able to update existing cart
    Given I set PUT api endpoints
    When I send PUT HTTP request
    And I receive valid data for updated cart

  Scenario: DELETE - As admin I have be able to delete existing user
    Given I set DELETE api endpoints
    When I send DELETE HTTP request
    Then I receive valid HTTP response code 204