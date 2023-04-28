Feature: User
  As an user
  I want to register
  So that I can login

  Scenario: POST - As user I have be able to register
    Given I set POST api endpoints
    When I send POST HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for new user

  Scenario: POST - As user I have be able to login
    Given I set POST api endpoints to login
    When I send POST HTTP request to login
    Then I receive valid HTTP response code 200 to login
    And I receive valid login data