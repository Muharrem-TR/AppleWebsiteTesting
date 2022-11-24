Feature: Site Map Assertion

  Background: Navigate to apple/tr web site
    Given Go to Apple website (Turkey)
    Then  Verify that you are on the right site

  Scenario: List all elements from Site Map
    Given Click to sitemap link
    When Verify the link
    And Random click on top menu
    And Select random product in the top menu list
    Then Check random product in the sitemap
    And Export contents to excel file

