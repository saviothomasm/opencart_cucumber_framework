Feature: Login Data Driven

#ctrl+shft+f - alignment/pretty format

  Scenario Outline: Login Data Driven
    Given User Launch browser
    And opens URL "http://localhost/opencart/upload/"
    When User navigate to MyAccount menu
    And click on Login
    And User enters Email as "<email>" and Password as "<password>"
    And Click on Login button
    Then User navigates to MyAccount Page


    Examples: 
      | email              | password | 
      | xyz@gmail.com      | as34srxv | 
      | savio196@gmail.com | test@123 | 
