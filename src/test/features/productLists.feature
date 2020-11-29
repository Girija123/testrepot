Feature: Product Lists
  As a User
  I should see list of products

  Scenario: Verify i get list of appropriate products through menu options

    Given I'm on HomePage "https://www.next.co.uk"
    When I click menu option "WOMEN"
    And I click submenu option "Jeans"
    Then I should see relevant products listed


