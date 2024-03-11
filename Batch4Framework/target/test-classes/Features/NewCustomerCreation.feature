@sanity

Feature: Creating a New Customer

  Background: 
    Given User navigates to the application under test
    And User will enter the username as "mngr551332"
    And User enters the password as "jEsyvUv"
    When User will click on the login  button
    Then User will be navigated to the home page of the application

  Scenario Outline: Creating a New Customer Functionality
    And User will click on New Customer link
    And User will enter the Customer name as "<customer_name>"
    And User will select gender
    And User will add the Date of birth as "<date_of_birth>"
    And User enter the city as "<city>"

    Examples: 
      | customer_name | date_of_birth | city    |
      | Suresh        | 04-11-1994    | Kolkata |
