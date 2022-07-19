Feature: As a user Admin want to put product to update data

  Scenario: As a user, Admin want to put product with valid data
    Given Admin want success auth with existing account to put product
    When Admin set Put Api Product endpoint
    And Admin send Put Product endpoint
    Then Admin receive valid Put Product http response code 200

  Scenario: As a user, Admin want to put product with invalid ID
    Given Admin want success auth with existing account to put product
    When Admin set Put Api Product endpoint invalid ID
    And Admin send Put Product endpoint invalid ID
    Then Admin receive invalid Put Product http response code 404

  Scenario: As a user, Admin want to put product without input token
    Given Admin set Put Api Product endpoint
    When Admin send Put Product endpoint
    Then Admin receive invalid Put Product http response code 400
    And Admin receive error message to Put Product

  Scenario: As a user, Admin want to put product with invalid token
    Given Admin set Put Api Product endpoint with invalid token
    When Admin send Put Product endpoint with invalid token
    Then Admin receive invalid Put Product http response code 401
    And Admin receive error message to Put this Product

  Scenario: As a user, I want to put product with valid data
    Given I want success auth with existing account to Put Product
    When I set Put Api Product endpoint
    And I send Put Product http request
    Then I receive invalid Put Product http response code 401