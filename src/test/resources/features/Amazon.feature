@amazon
  Feature: US981_Amazon sitesinde yeni hesap acilacak.

    Scenario: TC001 Pozitive test yapilacak
      Given kullanici "https://www.amazon.com" sayfasina erken gider
      And kullanici New Customer Star Here butonunu tiklar
      Then kullanici "Thomas Jeffersonm" kismina adini yazacak
      And kullanici "thomas654qq@gmail.com" kismina teelfonunu yada email girecek
      And kullanici "321654thomas" kismina sifresini girecek
      And kullanici "321654thomas" kismina tekrardan ayni sifreyi girecek
      Then kullanici Continue butonuna tiklayacak
      And verifid "Solve this puzzle to protect your account"
