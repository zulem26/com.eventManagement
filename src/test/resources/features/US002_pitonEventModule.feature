@event
Feature: US002 the user operates in the event module

  Scenario Outline: user in the event module
    Given user go to "piton" page
    When user types "<username>" in username box and "<password>" in password box
    And user creates an event and displays the event form
    And displays errors when the user clicks the create button without filling out the event form
    And user should be able to add new participant when click the Add participant button
    And user should view error mesage if removes all participants
    And user should be able to create new event if fills all required fields and redirect to dashboard page with create succesful message
    And user should be able to edit event when user click the edit button all event fields must be filled according to editing event
    And user should be able to update event if required fields filled and redirect to dashboard page with update succesful message

    Examples:
    |username|password|
    |automationtest|123456789|
