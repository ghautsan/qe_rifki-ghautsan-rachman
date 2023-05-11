Feature: User
  As an user
  I want to see list of products
  So that I can buy product

  Scenario: GET - As admin I have be able to get all posts
    Given I set GET api endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 200

  @post
  Scenario: POST - As admin I have be able to create new product
    Given I set POST api endpoints
    When I send POST HTTP request
    Then I receive valid HTTP response code 200 after create new product
    And I receive valid data for new post

  @get-product
  Scenario: GET - As admin I have be able to get product by id
    Given I set GET api endpoints to get product by id
    When I send GET HTTP request to get product by id
    And I receive valid data for product

  @delete-products
  Scenario: DELETE - As admin I have be able to delete existing user
    Given I set DELETE api endpoints
    When I send DELETE HTTP request
    Then I receive valid HTTP response code 200 from delete

  @assign-rating
  Scenario: POST - As admin I have be able to assign rating
    Given I set POST api endpoints to assign rating
    When I send POST HTTP request to assign rating
    Then I receive valid HTTP response code 200 assign rating
    And I receive valid data for new ratings

  @get-rating
  Scenario: GET - As admin I have be able to get product rating
    Given I set GET api endpoints to get product rating
    When I send GET HTTP request to get product rating
    And I receive valid data for product rating

  @create-comment
  Scenario: POST - As admin I have be able to create comment
    Given I set POST api endpoints to create comment
    When I send POST HTTP request to create comment
    Then I receive valid HTTP response code 200 to create comment

  @get-comment
  Scenario: GET - As admin I have be able to get product comment
    Given I set GET api endpoints to get product comment
    When I send GET HTTP request to get product comment
    And I receive valid data for product comment

  @create-categories
  Scenario: POST - As admin I have be able to create new categories
    Given I set POST api endpoints new categories
    When I send POST HTTP request new categories
    Then I receive valid HTTP response code 200 after create new categories
    And I receive valid data for new categories

  @get-categories
  Scenario: GET - As admin I have be able to get categories by id
    Given I set GET api endpoints to get categories by id
    When I send GET HTTP request to get categories by id
    And I receive valid data for categories

  @all-categories
  Scenario: GET - As admin I have be able to get all categories
    Given I set GET api endpoints all categories
    When I send GET HTTP request all categories
    Then I receive valid HTTP response code 200 all categories

  @delete-categories
  Scenario: DELETE - As admin I have be able to delete existing categories
    Given I set DELETE api endpoints delete existing categories
    When I send DELETE HTTP request delete existing categories
    Then I receive valid HTTP response code 200 from delete existing categories

  @register
  Scenario: POST - As admin I have be able to register
    Given I set POST api endpoints register
    When I send POST HTTP request register
    Then I receive valid HTTP response code 200 after register

  @login
  Scenario: POST - As user I have be able to login
    Given I set POST api endpoints to login
    When I send POST HTTP request to login
    Then I receive valid HTTP response code 200 to login

  @get-user
  Scenario: GET - As admin I have be able to get user info
    Given I set GET api endpoints get user
    When I send GET HTTP request get user
    Then I receive valid HTTP response code 200 get user

  @get-hello
  Scenario: GET - As admin I have be able to get hello
    Given I set GET api endpoints get hello
    When I send GET HTTP request get hello
    Then I receive valid HTTP response code 200 get hello

  @create-order
  Scenario: POST - As admin I have be able to create new order
    Given I set POST api endpoints new order
    When I send POST HTTP request new order
    Then I receive valid HTTP response code 200 after create new order
#    And I receive valid data for new order

  @get-all-order
  Scenario: GET - As admin I have be able to get all order
    Given I set GET api endpoints get all order
    When I send GET HTTP request get all order
    Then I receive valid HTTP response code 200 get all order

  @get-order
  Scenario: GET - As admin I have be able to get order by id
    Given I set GET api endpoints to get order by id
    When I send GET HTTP request to get order by id
    And I receive valid data for order