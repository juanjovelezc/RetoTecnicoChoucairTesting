# Author Juan José Vélez Cano

  @stories
  Feature: UTest
    A user enters to the uTest Academy platform and seeks to register
  @scenario1
  Scenario: Register on the uTest Academy platform
    Given The user seeks to register on the platform
    When The user clicks on the option to register and proceeds to complete the form
    | strFirstName | strLastName | strEmail | strCity | strZip | strCountry | strComputer | strVersion | strLanguage | strMobilDevice | strModel | strOS | strPass | strConfirmPass |
    | Juan | Velez | email2234fdd@gmail.com | Caldas     | 055440 | Colombia   | Windows     | 10         | Spanish     | Apple          | Iphone   | iOS 15.1 | jjVlzC1997 | jjVlzC1997 |
    Then He registers correctly,now
    | strPlatformName |
    | Participate in the uTest Academy |
