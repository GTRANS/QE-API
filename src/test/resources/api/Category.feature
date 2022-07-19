Feature: As a user Admin want to post category

  Scenario: As a user, Admin want to post Category with valid data
    Given Admin want success auth with existing account to post category
    When Admin set Post Api Category endpoint
    And Admin send Post Category http request
    Then Admin receive valid Post Category http response code 200

  Scenario: As a user, I want to post Category with empty saldo
    Given Admin want success auth with existing account to post category
    When Admin set Post Api Category endpoint
    And Admin send Post Category http request empty saldo
    Then Admin receive invalid Category http response code 500

  Scenario: As a user, I want to post Category with valid data
    Given I want success auth with existing account to post category
    When I set Post Api Category endpoint
    And I send Post Category http request
    Then I receive invalid Post Category http response code 401

  Scenario: As a user, Admin want to post Category without token
    Given Admin set Post Api Category endpoint
    When Admin send Post Category http request
    Then Admin receive invalid Category http response code 400
    And Admin receive error message to post Category

  Scenario: As a user, Admin want to post Category with invalid token
    Given Admin set Post Api Category endpoint with invalid token
    When Admin send Post Category endpoint with invalid token
    Then Admin receive invalid Post Category http response code 401
    And Admin receive error message to Post Category