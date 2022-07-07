Feature: As a user I want to get buy product

  Scenario: As a user, I want to get buy product with ID
    Given I want success auth with existing account to buy product
    When I set Get Api Buy Product endpoint
    And I send Get Buy Product endpoint
    Then I receive valid Buy Product http response code 200

  Scenario: As a user, I want to get buy product without ID
    Given I set Get Api Buy Product endpoint without ID
    When I send Get Buy Product endpoint without ID
    Then I receive invalid Buy Product http response code 404
    And I receive error message to buy product