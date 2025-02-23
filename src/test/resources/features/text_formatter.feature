Feature: Text Formatter

  Scenario: Convert a sentence to title case
    Given I have a sentence "hello world from cucumber"
    When I convert it to title case
    Then the result should be "Hello World From Cucumber"
