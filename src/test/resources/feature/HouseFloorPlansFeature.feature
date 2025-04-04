Feature: Test the House floor plans

  Background: 
    Given I launch the Browser
  @
  Scenario: To verify user able to nevigate house Floor plans screen
    Given I Click on House floor plans option link
    And I verify Plot Dimensions changes
    And user should be able to nevigate to the Floor plans screen
    When I click on the arrow icon
    Then User should be able see the details of floor plan
