Feature: Test Google application

  Scenario: Test google page title
    Given I open Google application
    When I capture title
    Then I should get valid title as Google

  Scenario: Test search feature of Google
    Given open google application
    When I search valid keyword and go for search
    Then I should get a valid search result