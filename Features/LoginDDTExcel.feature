Feature: Login Data Driven with Excel

#ctrl+shft+f - alignment/pretty format

  Scenario Outline: Login Data Driven Excel
    Given User Launch browser
    And opens URL "http://localhost/opencart/upload/"
    When User navigate to MyAccount menu
    And click on Login
    Then check User navigates to MyAccount Page by passing Email and Passoword with excel row "<row_index>"

    Examples: 
      |row_index| 
      |1| 
      |2| 
      |3|