Feature: Testing POST for /pet

  Scenario Outline: POST pet test
    Given I get "<Method>" id "<Id>" from request "<request>"
    When I use id "<Id>" from "<Method>" in "POST"
    Then I Got Response "<number>"

    Examples:
      | Method | Id | request      | Status    | number |
      | GET    | 1  | /pet/{petId} | available | 200    |
      | GET    | 8  | /pet/{petId} | sold      | 200    |
