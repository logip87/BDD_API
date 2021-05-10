Feature: Testing POST for /pet

  Scenario Outline: POST pet test
    Given I get "<Method>" id "<Id>" from request "<request>"
    And I see response code "<number>" and status "<Status>"
    When I use Body from "<Method>" in "POST" method
    Then I Got Response "<number>"

    Examples:
      | Method | Id | request      | Status    | number |
      | GET    | 8  | /pet/{petId} | available | 200    |
