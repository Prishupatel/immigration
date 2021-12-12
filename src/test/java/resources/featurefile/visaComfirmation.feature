Feature: Visa confirmation test


  Scenario Outline: an Australian coming to uk for tourism
    Given I am on start page
    Then  I select my nationality "<nationality>"
    And  I click on continue
    And  I select purpose of trip "<purpose>"
    And  I click on continue
    And  I see result page


    Examples:
      | nationality | purpose |
      | Australia   | Tourism |


  Scenario Outline: a Chilean to the uk for work and plan to stay longer than six months
    Given I am on start page
    Then I select my nationality "<nationality>"
    And I click on continue
    And I select purpose of trip "<purpose>"
    And I click on continue button
    And I duration of stay "<duration>"
    And I clicked continue
    And I select work type "<workType>"
    And I clicked on continue in work type page
    And I see result page

    Examples:
      | nationality | purpose                          | duration             | workType                     |
      | Chile       | Work, academic visit or business | longer than 6 months | Health and care professional |

  @smoke
  Scenario Outline: a Colombian National coming to uk to join a partner for a long stay
    Given I am on start page
    Then I select my nationality "<nationality>"
    And I click on continue
    And I select purpose of trip "<purpose>"
    And I click on continue button
    And I select my partner UK immigration status "<status>"
    And I click on continue button in family immigration page
    And I see result page




    Examples:
      | nationality | purpose                                | status |
      | Colombia    | Join partner or family for a long stay | Yes    |


