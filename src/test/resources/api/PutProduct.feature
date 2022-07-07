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