Feature: As a user I want to get product by category

  Scenario: As a user, I want to get product with ID
    Given I want success auth with existing account to get product
    When I set Get Api Product endpoint
    And I send Get Product endpoint
    Then I receive valid Product http response code 200

  Scenario: As a user, I want to get product without ID
    Given I set Get Api Product endpoint without ID
    When I send Get Product endpoint without ID
    Then I receive invalid Product http response code 404
    And I receive error message

  Scenario: As a user, I want to get product by category and provider with ID
    Given I want success auth with existing account to get product
    When I set Get Api Product by category endpoint
    And I send Get Product by category endpoint
    Then I receive valid Product by category http response code 200

  Scenario: As a user, I want to get product with invalid token
    Given I set Get Api Product endpoint with invalid token
    When I send Get Product endpoint with invalid token
    Then I receive invalid Product http response code 401
    And I receive error message to get product

  Scenario: As a user, I want to get product without input token
    Given I set Get Api Product endpoint without input token
    When I send Get Product endpoint without input token
    Then I receive invalid Product http response code 400
    And I receive error message to get this product


