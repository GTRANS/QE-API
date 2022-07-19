Feature: As a user I want to get providers by category

  Scenario: As a user, I want to get providers by category with ID
    Given I want success auth with existing account to get Provider
    When I set Get Api Provider endpoint
    And I send Get Provider endpoint
    Then I receive valid Provider http response code 200

  Scenario: As a user, I want to get providers by category with empty ID
    Given I want success auth with existing account to get Provider
    When I set Get Api Provider endpoint empty ID
    And I send Get Provider endpoint empty ID
    Then I receive invalid Provider http response code 404

  Scenario: As a user, I want to get providers by category without input token
    Given I set Get Api Provider endpoint without input token
    When I send Get Provider endpoint without input token
    Then I receive invalid Provider http response code 400
    And I receive error message to get Provider

  Scenario: As a user, I want to get providers by category with invalid token
    Given I set Get Api Provider endpoint with invalid token
    When I send Get Provider endpoint with invalid token
    Then I receive invalid Provider http response code 401
    And I receive error message to get this Provider
