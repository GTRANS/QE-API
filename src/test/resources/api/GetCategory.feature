Feature: As a user I want to get product by category


  Scenario: As a user, I want to get product by Category with ID
    Given I want success auth with existing account to get Category
    When I set Get Api product by Category endpoint
    And I send Get product by Category endpoint
    Then I receive valid category http response code 200

  Scenario: As a user, I want to get product by Category without input token
    Given  I set Get Api Category endpoint without input token
    When I send Get Category endpoint without input token
    Then I receive invalid Category http response code 404
    And I receive error message


  Scenario: As a user, I want to get Category with valid url
    Given I want success auth with existing account to get Category
    When I set Get Api Category endpoint
    And I send Get Category endpoint
    Then I receive valid category http response code 200


  Scenario: As a user, Admin want to get Category saldo
    Given Admin want success auth with existing account to get Category
    When Admin set Get Api Category saldo endpoint
    And Admin send Get Category saldo endpoint
    Then Admin receive valid category http response code 200

  Scenario: As a user, I want to get Category saldo
    Given I want success auth with existing account to get Category
    When I set Get Api Category saldo endpoint
    And I send Get Category saldo endpoint
    Then I receive invalid Category http response code 401