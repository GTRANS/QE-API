Feature: As a user I want success get status transaction

  Scenario: As a user, I want success get status Transaction
    Given I want success auth with existing account to get transaction
    When I set Get Api Transaction endpoint
    And I send Get Transaction endpoint
    Then I receive valid Get Transaction http response code 200

  Scenario: As a user, I want success get status Transaction with invalid url
    Given I want success auth with existing account to get transaction
    When I set Get Api Transaction endpoint invalid url
    And I send Get Transaction endpoint invalid url
    Then I receive invalid Get Transaction http response code 404

  Scenario: As a user, Admin want success get data Transaction
    Given Admin want success auth with existing account to get transaction
    When Admin set Get Api Data Transaction endpoint
    And Admin send Get Data Transaction endpoint
    Then Admin receive valid Get Data Transaction http response code 200

  Scenario: As a user, I want success get data Transaction
    Given I want success auth with existing account to get transaction
    When I set Get Api Data Transaction endpoint
    And I send Get Data Transaction endpoint
    Then I receive invalid Get Data Transaction http response code 401
    And I receive error message to Get Data Transaction

  Scenario: As a user, Admin want success get data Transaction pemasukan
    Given Admin want success auth with existing account to get transaction
    When Admin set Get Api Transaction pemasukan endpoint
    And Admin send Get Transaction pemasukan endpoint
    Then Admin receive valid Get Transaction pemasukan http response code 200

  Scenario: As a user, I want success get data Transaction pemasukan
    Given I want success auth with existing account to get transaction
    When I set Get Api Transaction pemasukan endpoint
    And I send Get Transaction pemasukan endpoint
    Then I receive invalid Get Transaction pemasukan http response code 401

  Scenario: As a user, I want success get status Transaction with ID
    Given I want success auth with existing account to get transaction
    When I set Get Api Transaction with ID endpoint
    And I send Get Transaction with ID endpoint
    Then I receive valid Get Transaction http response code 200

  Scenario: As a user, Admin want success get status Transaction with ID
    Given Admin want success auth with existing account to get transaction
    When Admin set Get Api Transaction with ID endpoint
    And Admin send Get Transaction with ID endpoint
    Then Admin receive valid Get Transaction http response code 200

  Scenario: As a user, I want success get status Transaction without ID
    Given I want success auth with existing account to get transaction
    When I set Get Api Transaction without ID endpoint
    And I send Get Transaction without ID endpoint
    Then I receive invalid Get Transaction http response code 404

  Scenario: As a user, Admin want success get status Transaction without ID
    Given Admin want success auth with existing account to get transaction
    When Admin set Get Api Transaction without ID endpoint
    And Admin send Get Transaction without ID endpoint
    Then Admin receive invalid Get Transaction http response code 404


