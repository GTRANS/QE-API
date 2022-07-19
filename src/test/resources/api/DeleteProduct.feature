Feature: As a user Admin want to delete product

  Scenario: As a user, Admin want to delete product with valid ID
    Given Admin want success auth with existing account to delete product
    When Admin set Delete Api Product endpoint
    And Admin send Delete Product endpoint
    Then Admin receive valid Delete Product http response code 200

  Scenario: As a user, Admin want to delete product without input token
    Given Admin set Delete Api Product endpoint
    When Admin send Delete Product endpoint
    Then Admin receive invalid Delete Product http response code 400
    And Admin receive error message to Delete Product

  Scenario: As a user, Admin want to delete product with invalid ID
    Given Admin want success auth with existing account to delete product
    When Admin set Delete Api Product endpoint invalid ID
    And Admin send Delete Product endpoint invalid ID
    Then Admin receive valid Delete Product http response code 404

  Scenario: As a user, Admin want to delete product with invalid token
    Given Admin set Delete Api Product endpoint with invalid token
    When Admin send Delete Product endpoint with invalid token
    Then Admin receive invalid Delete Product http response code 401
    And Admin receive error message to Delete this Product

  Scenario: As a user, I want to delete product with valid data
    Given I want success auth with existing account to delete product
    When I set Delete Api Product endpoint
    And I send Delete Product http endpoint
    Then I receive invalid Delete Product http response code 401

