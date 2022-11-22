Feature: Site Map Assertion

  Background: Navigate to apple/tr web site
    Given Go to Apple website (Turkey)
    Then  Verify that you are on the right site

  Scenario: List all elements from Site Map
    Given Click to sitemap link
    When Verify the link
    And Random click on top menu
    Then Check product in the sitemap list
   # And Export contents to excel file

