Feature: Dumb test demo
  A dumb test demo to verify test launch

  Scenario: Get the service data
    Given i'm connected as root
    When I ask for data
    Then I get all I want