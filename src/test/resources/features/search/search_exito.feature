Feature: Search by keyword

  Scenario: Searching for a section
    Given yoimar is searching for a section
    When he looks up for the section "televisores"
    Then he should see information about the section "televisores"


