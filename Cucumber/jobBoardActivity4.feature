@activity
Feature: Basic Syntax

Scenario Outline: Testing with data
    Given User is on Jobs page
    When User goes to post a job
    Then Post a job with details "<Email>" "<Title>" and "<Location>"
    And Verify job is posted
    And Close the Browser
    
Examples:
    | Email 				| Title 				|Location |
    | test@test.com | Test Enginer  | Gurgaon|
    