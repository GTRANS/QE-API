Feature: As a user I want success get status transaction

  Scenario: As a user, I want success get status Transaction
    Given I want success auth with existing account to get transaction
    When I set Get Api Transaction endpoint
    And I send Get Transaction endpoint
    Then I receive valid Transaction http response code 200

  Scenario: As a user, I want success get status Transaction with invalid url
    Given I want success auth with existing account to get transaction
    When I set Get Api Transaction endpoint invalid url
    And I send Get Transaction endpoint invalid url
    Then I receive invalid Transaction http response code 404