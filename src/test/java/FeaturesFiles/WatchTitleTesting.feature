Feature: Watch Title Functionality

  Background: Go to website and verify you are on the correct website
    Given Go to Apple website (Turkey)
    Then  Verify that you are on the right site

  Scenario: Clicking Functions and Verify

    And Click function control
      | watchTitle |
    And Verification function check
      | comparing1          | Apple Watch Ultra      |
      | comparing1          | Apple Watch Series 8   |
      | comparing1          | Apple Watch SE         |
      | comparing1          | Apple Watch Nike       |
      | comparing1          | Karşılaştırın          |
      | comparing1          | Kayışlar               |
      | comparing1          | AirPods                |
      | comparing1          | Aksesuarlar            |
      | comparing1          | watchOS                |
      | comparing1          | Apple Watch satın alın |
      | maceraSaatlerVerify | Macera dolu saatler    |
    And Click function control
      | ultraFilmButton  |
      | modalCloseButton |
      | dahaFazlaLink    |
    And Verification function check
      | series8Verify | Gelecek |
    And Click function control
      | watchTitle |
      | comparingLink |
      | comparingModelsLink |
    And Verification function check
      | appleTitleVerify | Apple Watch modelleri |
      | appleModelsVerify | Apple Watch Ultra |
      | appleModelsVerify | Apple Watch Series 8|
      | appleModelsVerify | Apple Watch SE |
      | appleModelsVerify | Apple Watch Series 7 |
      | appleModelsVerify | Apple Watch Series 6 |
      | appleModelsVerify | 1. Nesil Apple Watch SE |
      | appleModelsVerify | Apple Watch Series 5 |
      | appleModelsVerify | Apple Watch Series 4 |
      | appleModelsVerify | Apple Watch Series 3 |
      | appleModelsVerify | Apple Watch Series 2 |
      | appleModelsVerify | Apple Watch Series 1 |
    And Click function control
      | modalCloseButton |
    And Verification function check
      | modelsFeatureVerify | Hızlı Bakış |
      | modelsFeatureVerify | Ekran |
    And Click function control
      | kasa41mmButton |
      | kasa40mmButton |
    And Verification function check
      | modelsFeatureVerify | Materyaller ve Renkler |
    And Click function control
      | colorsButton |
      | colorsButton |
      | colorsButton |
      | colorsButton |
      | colorsButton |
      | colorsButton |
      | colorsButton |
      | colorsButton |
      | colorsButton |
      | colorsButton |
      | colorsButton |
    And Verification function check
      | modelsFeatureVerify | Sağlık ve Zindelik |
      | modelsFeatureVerify | Güvenlik ve Acil Durum |
      | modelsFeatureVerify | Hücresel Bağlantı |
      | modelsFeatureVerify | Teknoloji |
      | teknikTitleVerify | Teknik Özellikler |
    And Click function control
      | subTitlesButton |
    And Verification function check
      | SubVerify1 | GPS + Cellular|
    And Click function control
      | subTitlesButton |
    And Verification function check
      | SubVerify2 | 45 mm x 38 mm|
    And Click function control
      | subTitlesButton |
    And Verification function check
      | SubVerify3 | 45 mm|
    And Click function control
      | subTitlesButton |
    And Verification function check
      | SubVerify4 | L1 GPS, GLONASS, Galileo, QZSS ve BeiDou|
    And Click function control
      | subTitlesButton |
    And Verification function check
      | SubVerify5 | 64 bit çift çekirdekli işlemciye sahip S8 SiP|
    And Click function control
      | subTitlesButton |
    And Verification function check
      | SubVerify6 | LTE ve UMTS|
    And Click function control
      | subTitlesButton |
    And Verification function check
      | SubVerify7 | Şarj edilebilir yerleşik lityum iyon pil|
    And Click function control
      | subTitlesButton |
    Then Verification function check
      | SubVerify8 | Kasası %100 geri dönüştürülmüş|









