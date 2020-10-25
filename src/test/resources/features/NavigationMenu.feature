@navigate
Feature: Navigation Menu

  @vehicles
  Scenario: Navigate to Vehicles
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigate to "vehicles" page
    Then the user should see "Vehicles" as a page title


  @campaigns
  Scenario: Navigate to campaigns
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigate to "campaigns" page
    Then the user should see "Campaigns" as a page title

  @calendar_events @db
  Scenario: Navigate to Vehicles
    Given the user is on the login page
    And the user enters the sales manager information
    When the user navigate to "calendar events" page
    Then the user should see "Calendar Events" as a page title