Feature: As a user Admin want to post product

  Scenario: As a user, Admin want to post product with valid data
    Given Admin want success auth with existing account to post product
    When Admin set Post Api Product endpoint
    And Admin send Post Product endpoint
    Then Admin receive valid Post Product http response code 200

  Scenario: As a user, Admin want to post product with empty category ID
    Given Admin want success auth with existing account to post product
    When Admin set Post Api Product endpoint
    And Admin send Post Product endpoint empty category ID
    Then Admin receive invalid Post Product http response code 500

  Scenario: As a user, Admin want to post product with empty provider ID
    Given Admin want success auth with existing account to post product
    When Admin set Post Api Product endpoint
    And Admin send Post Product endpoint empty provider ID
    Then Admin receive invalid Post Product http response code 500

  Scenario: As a user, Admin want to post product with invalid ID
    Given Admin want success auth with existing account to post product
    When Admin set Post Api Product endpoint
    And Admin send Post Product endpoint with invalid ID
    Then Admin receive invalid Post Product http response code 500

  Scenario: As a user, I want to post product with empty name
    Given Admin want success auth with existing account to post product
    When Admin set Post Api Product endpoint
    And Admin send Post Product endpoint empty name
    Then Admin receive invalid Post Product http response code 500