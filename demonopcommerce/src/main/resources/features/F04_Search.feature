@smoke
  Feature:Search functionality
    Scenario Outline: user could search using product name.
      Given user go to homepage
      When I enter product name as "<productName>"
      Then product name is displayed "<productName>"
      Examples:
        |productName|
        |book|
        |laptop|
        |nike|


    Scenario Outline: user could search for product using sku.
      Given user go to homepage
      When I enter sku as "<sku_word>"
      Then search result is displayed"<sku_word>"
      Examples:
        |sku_word|
        |SCI_FAITH|
        |APPLE_CAM|
        |SF_PRO_11|
