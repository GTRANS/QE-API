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
