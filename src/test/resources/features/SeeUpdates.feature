Feature: Verifying I can see all friends updates

  @Smoke @TIHQTDM-2
  Scenario: I want all friends updates
    Given I navigate to Today I have application
    When I see the Home page
    Then I see Updates table