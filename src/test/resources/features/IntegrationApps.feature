Feature: Searching for Integration App

  As a logged in user
  I want to search for an integration App
  So that I can associate it to my account

  Background:
    Given I navigate to StitchData home page

  Scenario Outline: Searching for a valid integration app
    Given I login with following user credential
      | Prashantkumargautam@gmail.com | Ridhima2015* |
    When search for integration app "<appName>"
    Then I see <resultCount> integration apps are certified by StitchData
    Examples:
      | appName | resultCount |
      | MongoDB | 1           |
      | Ad      | 4           |