Feature: Website address check

  Background: Go to website and verify you are on the correct website
    Given Go to Apple website (Turkey)
    Then  Verify that you are on the right site

  @SmokeTest
  Scenario Outline: URL control of links under Services, Shopping and Detailed Information

    Given URL control of the links under the heading of "<Shopping and Detailed Information>"
    When Check the url of the menus under Shopping and Detailed Information

    Given URL control of the links under the "<Services>" heading
    When Check the url of the menus under services

    Given URL checking of links under "<Apple's Values>"
    When Check the url of the menus under Apple's Values

    Given URL check of links under "<About Apple>"
    When Check the url of the menus under About Apple

    Examples:
      | Shopping and Detailed Information | Services                  | Apple's Values                     | About Apple                     |
      | altBilgiMenuStore                 | altBilgiMenuAppleMusic    | altBilgiMenuAccessibility          | altBilgiMenuNewsroom            |
      | altBilgiMenuMac                   | altBilgiMenuAppleArcade   | altBilgiMenuEnvironment            | altBilgiMenuAppleLeadership     |
      | altBilgiMenuIpad                  | altBilgiMenuICloud        | altBilgiMenuPrivacy                | altBilgiMenuCareerOpportunities |
      | altBilgiMenuIphone                | altBilgiMenuAppleBooks    | altBilgiMenuSupplierResponsibility | altBilgiMenuWarranty            |
      | altBilgiMenuWatch                 | altBilgiMenuApplePodcasts | pass                               | altBilgiMenuEthicsAndCompliance |
      | altBilgiMenuAirpods               | altBilgiMenuAppleStore    | pass                               | altBilgiMenuEvents              |
      | altBilgiMenuTvandHome             | pass                      | pass                               | altBilgiMenuContactApple        |
      | altBilgiMenuAirtag                | pass                      | pass                               | pass                            |
      | altBilgiMenuAccessories           | pass                      | pass                               | pass                            |

#   Veri olmayan yerlere "pass" yazılmalıdır. Bu sayede Test ve Doğrulama pas geçilecektir. Aksi taktirde hata alınır.












#  -------------------------------  Uzun ve Karmaşık Hali  -------------------------------
#  @SmokeTest
#  Scenario: URL control of the links under the heading of Shopping and Detailed Information
#    Given Click store from the Apple Footer menu
#    When Check the url of the menus under Shopping and Detailed Information
#    Given Click Mac from the Apple Footer menu
#    When Check the url of the menus under Shopping and Detailed Information
#    Given Click Ipad from the Apple Footer menu
#    When Check the url of the menus under Shopping and Detailed Information
#    Given Click Iphone from the Apple Footer menu
#    When Check the url of the menus under Shopping and Detailed Information
#    Given Click watch from the Apple Footer menu
#    When Check the url of the menus under Shopping and Detailed Information
#    Given Click airpods from the Apple Footer menu
#    When Check the url of the menus under Shopping and Detailed Information
#    Given Click tv and home from the Apple Footer menu
#    When Check the url of the menus under Shopping and Detailed Information
#    Given Click airtag from the Apple Footer menu
#    When Check the url of the menus under Shopping and Detailed Information
#    Given Click accessories from the Apple Footer menu
#    When Check the url of the menus under Shopping and Detailed Information
#
#  @SmokeTest
#  Scenario: URL control of the links under the Services heading
#    Given Click apple music from the Apple Footer menu
#    When Check the url of the menus under services
#    Given Click apple arcade from the Apple Footer menu
#    When Check the url of the menus under services
#    Given Click iCloud from the Apple Footer menu
#    When Check the url of the menus under services
#    Given Click apple books from the Apple Footer menu
#    When Check the url of the menus under services
#    Given Click apple podcasts from the Apple Footer menu
#    When Check the url of the menus under services
#    Given Click app store from the Apple Footer menu
#    When Check the url of the menus under services