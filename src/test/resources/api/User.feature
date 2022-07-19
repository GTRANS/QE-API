Feature: As a user I want to put update data product

  Scenario: As a user, I want to put update data product
    Given I want success auth with existing account to put data product
    When I set Put Api data product endpoint
    And I send Put data product endpoint
    Then I receive valid data product http response code 200

  Scenario: As a user, I want to put update data product without token
    Given I set Put Api data product endpoint
    When I send Put data product http request without token
    Then I receive invalid data product http response code 400
    And I receive error message to put data product

  Scenario: As a user, Admin want to put update data product
    Given Admin want success auth with existing account to put data product
    When Admin set Put Api data product endpoint
    And Admin send Put data product endpoint
    Then Admin receive valid data product http response code 200

  Scenario: As a user, Admin want to put update data product without token
    Given Admin set Put Api data product endpoint
    When Admin send Put data product http request without token
    Then Admin receive invalid data product http response code 400
    And Admin receive error message to put data product

  Scenario: As a user, Admin want to put update data product with invalid token
    Given Admin set Put Api Data User endpoint with invalid token
    When Admin send Put Data User invalid token http request
    Then Admin receive invalid Data User http response code 401
    And Admin receive error message to put update data product

