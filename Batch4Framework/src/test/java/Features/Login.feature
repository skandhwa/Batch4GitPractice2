@sanity

Feature: Creating a Login Functionality

  Scenario Outline: Validating the Login Functionality
    Given User navigates to the application under test
    And User will enter the username as "<Username>"
    And User enters the password as "<Password>"
    When User will click on the login  button
    Then User will be navigated to the home page of the application

    Examples: 
      | Username   | Password |
      | mngr551332 | jEsyvUv  |
