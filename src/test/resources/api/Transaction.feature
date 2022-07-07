Feature: As a user I want success transaction

  Scenario: As a user, I want success Transaction via bank with valid ID
    Given I want success auth with existing account to transaction
    When I set Post Api Transaction endpoint
    And I send Post Transaction endpoint
    Then I receive valid Transaction http response code 200

  Scenario: As a user, I want success Transaction via bank with invalid user ID
    Given I want success auth with existing account to transaction
    When I set Post Api Transaction endpoint
    And I send Post Transaction endpoint invalid user ID
    Then I receive invalid Transaction http response code 500

  Scenario: As a user, I want success Transaction via bank with invalid bank name
    Given I want success auth with existing account to transaction
    When I set Post Api Transaction endpoint
    And I send Post Transaction endpoint invalid bank name
    Then I receive invalid Transaction http response code 520

  Scenario: As a user, I want success Transaction via e-wallet with valid ID
    Given I want success auth with existing account to transaction
    When I set Post Api Transaction via e-wallet endpoint
    And I send Post Transaction via e-wallet endpoint
    Then I receive valid Transaction http response code 200

  Scenario: As a user, I want success Transaction via e-wallet with invalid ID
    Given I want success auth with existing account to transaction
    When I set Post Api Transaction via e-wallet endpoint
    And I send Post Transaction via e-wallet endpoint invalid ID
    Then I receive invalid Transaction http response code 500
