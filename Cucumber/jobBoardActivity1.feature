@activity
Feature: Basic Syntax

Scenario: Create a new user
    Given User is on JobBoard page
    When User enters "root" and "pa$$w0rd"
    Then Add new user with email "test123567@test.com"
    And Verify user is created
    And Close the Browser