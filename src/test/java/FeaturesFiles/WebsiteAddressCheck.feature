Feature: Website address check

  Background: Go to website and verify you are on the correct website
    Given Go to Apple website (Turkey)
    Then  Verify that you are on the right site

  Scenario: URL control of the links under the heading of Shopping and Detailed Information
    Given Click store from the Apple Footer menu
    When Check the url of the menus under Shopping and Detailed Information
    Given Click Mac from the Apple Footer menu
    When Check the url of the menus under Shopping and Detailed Information
    Given Click Ipad from the Apple Footer menu
    When Check the url of the menus under Shopping and Detailed Information
    Given Click Iphone from the Apple Footer menu
    When Check the url of the menus under Shopping and Detailed Information
    Given Click watch from the Apple Footer menu
    When Check the url of the menus under Shopping and Detailed Information
    Given Click airpods from the Apple Footer menu
    When Check the url of the menus under Shopping and Detailed Information
    Given Click tv and home from the Apple Footer menu
    When Check the url of the menus under Shopping and Detailed Information
    Given Click airtag from the Apple Footer menu
    When Check the url of the menus under Shopping and Detailed Information
    Given Click accessories from the Apple Footer menu
    When Check the url of the menus under Shopping and Detailed Information