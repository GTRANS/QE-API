Feature: As a user Admin want to post category

  Scenario: As a user, Admin want to post Category with valid data
    Given Admin want success auth with existing account to post category
    When Admin set Post Api Category endpoint
    And Admin send Post Category http request
    Then Admin receive valid Post Category http response code 200



