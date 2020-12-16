@activity
Feature: Basic Syntax

Scenario: Posting a job using parameterization
    Given User is on Jobs page
    When User goes to post a job
    Then Post a job with details "test@test.com" "Automation" and "Gurgaon"
    And Verify job is posted
    And Close the Browser