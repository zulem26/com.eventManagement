@dash
Feature: US003 user dashboard

  Scenario Outline: user can view the dashboard
    Given user go to "piton" page
    When user should redirect to login page if not authenticated "invalid_user" "invalid_password"
    And user types valid "<Username>" in username box and valid "<Password>" in password box
    And user should view notification message states no registered event found
    And user should be able navigate edit event when click the edit event button
    And user should be able to view event participants
    And user should be able to delete event when click the delete button


    Examples:
      | Username       | Password  |
      | automationtest | 123456789 |