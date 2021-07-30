Feature: Filtering updates by tags

  @Smoke @TIHQTDM-3
  Scenario Outline: I check the Title, Test and Tags are displayed
    Given I navigate to Today I have application
    When I enter a Tag
    Then I will be able to see the correct update
    Examples: