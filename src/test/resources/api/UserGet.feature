Feature: As a user I want to get data user

  Scenario: As a user, I want to get data user with valid data
    Given I want success auth with existing account to get data user
    When I set Get Api Data User endpoint
    And I send Get Data User endpoint
    Then I receive valid Data User http response code 200

  Scenario: As a user, I want to get data user without input token
    Given  I set Get Api Data User endpoint without token
    When  I send Get Data User http request
    Then I receive invalid Data User http response code 400
    And I receive error message to get Data User

  Scenario: As a user, I want to get data user with invalid token
    Given  I set Get Api Data User endpoint with invalid token
    When  I send Get Data User invalid token http request
    Then I receive invalid Data User http response code 401
    And I receive error message to get ID User
