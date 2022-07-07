Feature: As a user I want to create new Account

  Scenario: As a user, I want to create new account with valid data
    Given  I set Post Api Register endpoint
    When  I send Post Register http request
    Then I receive valid Register http response code 200
    And I receive valid data for detail user

  Scenario: As a user, I want to create new account with invalid email
    Given  I set Post Api Register endpoint
    When  I send Post Register http request with invalid email
    Then I receive invalid Register http response code 500
    And I receive error message to register

  Scenario: As a user, I want to create new account with empty email and password
    Given  I set Post Api Register endpoint
    When  I send Post Register http request with empty email and password
    Then I receive invalid Register http response code 500
    And I receive error message to register