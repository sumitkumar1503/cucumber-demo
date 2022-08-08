
Feature: Addition validation
  @test
  Scenario Outline: Add two number
    Given I have two number "<num1>" and "<num2>"
    When  I call addition method
    Then I should have output as "<result>"
    Examples:
      |num1  |num2 |result|
      |2     |3    |5     |
