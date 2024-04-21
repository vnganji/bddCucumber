Feature: login Feature using datatables

Background:
 Given create test data from "101" and "Sheet1"

  Scenario: user login to easyslenium and validate different inputform menu options using datatables
  	
    Given user navigates to easyselenium home page
    When used clicks on InputForm
    Then it displayed list of menu user actions
      | valid   |
      | invalid |

  Scenario: user login to easyslenium and enter username and password using datatables lists
    Given user navigates to easyselenium home page
    When used clicks on InputForm
    Then enter username and password
      | venkat | ganji |
      | siddu  | ganji |

  Scenario: user login to easyslenium and enter username and password using datatables Maps
    Given user navigates to easyselenium home page
    When used clicks on InputForm
    Then enter username and password as Maps
      | firstname | lastname |
      | venkat    | ganji    |
      | siddu     | ganji    |
