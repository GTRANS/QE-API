Feature: As a user I want to see my homepage

  Scenario: As a user, I want to login with valid data
    Given I set Post Api Login endpoint
    When I send Post Login http request
    Then I receive valid Login http response code 200
    And I receive valid data to login

  Scenario: As a user, i want to login with empty email and password
    Given I set Post Api Login endpoint
    When I send Post Login http request empty email and password
    Then I receive invalid Login http response code 404
    And I receive error message to login

  Scenario: As a user, I want to login with invalid email and password
    Given I set Post Api Login endpoint
    When I send Post Login http invalid email and password
    Then I receive invalid Login http response code 404
    And I receive error message to login

  Scenario: As a user, Admin want to login with valid data
    Given Admin set Post Api Login endpoint
    When Admin send Post Login http request
    Then Admin receive valid Login http response code 200
    And Admin receive valid data to login

  Scenario: As a user, Admin want to login with empty email and password
    Given Admin set Post Api Login endpoint
    When Admin send Post Login http request empty email and password
    Then Admin receive invalid Login http response code 404
    And Admin receive error message to login

  Scenario: As a user, Admin want to login with invalid email and password
    Given Admin set Post Api Login endpoint
    When Admin send Post Login http invalid email and password
    Then Admin receive invalid Login http response code 404
    And Admin receive error message to login