@activity
Feature: Basic Syntax

Scenario: Searching for jobs using XPath
    Given User is on Jobs page
    When User searches for job and change job type
    Then Find job and apply for job
    And Close the Browser