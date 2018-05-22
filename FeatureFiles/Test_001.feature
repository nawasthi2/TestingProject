Feature: Login Check

  Scenario Outline: Checking Login functionality.
    Given a user trying to login with his <userName> and <password>
    Then the user should be logged in successfully.

    Examples: 
      | userName     | password         |
      | "nehawasthi" | "19730911814192" |
