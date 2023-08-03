@smoke
Feature:F01_register|users could register with new accounts
  Scenario: guest user could register with valid data successfully
    Given user go to register page

    When user select gender type

    And user enter first name "emy automation"

    And user enter last name "tester"
    And user enter date of birth

    And user enter email "testema@example.com" field

    And user fills Password field "P@ssw0rd3"

    And user fills Confirm Password Field "P@ssw0rd3"

    And user clicks on register button

    Then success message is displayed

