* Feature
* Scenario
* Given
* And
* When
* Then
* But
* Background
* Scenario Outline
* Example

Feature: Kullanici Islemleri

  Background: Senaryodan once calistirilacak adimlar, before gibi
    Given q
    Then q

  Scenario: kullanici dogru bilgilerle kayit olur
    Given q
    And q
    When q

  Scenario Outline://Birden fazla data ile ayni test case'de test yapacaksan
    Given q
    And q "<kelime>"
    Examples:
      | kelime  |
      | asasa   |
      | aasa    |
      | fdadasd |