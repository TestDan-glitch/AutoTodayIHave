Feature: Checking Add New Update options
  I want to log into Today I have

  @Smoke @TIHQTDM-1
  Scenario: I check the Title, Test and Tags are displayed
    Given I navigate to Today I have application
    When I click the Options button
    And I click the Add New Update button
    Then there will be a Title: a headline for the update
    And there will be a Text: the main body of the update
    And there will be a Tag: user-defined labels that can be used to filter updates

