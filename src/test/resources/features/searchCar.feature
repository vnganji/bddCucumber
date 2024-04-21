@bvt
Feature: login Feature

  Scenario Outline: user login to easyslenium and validate different inputform menu options
    Given user navigates to easyselenium home page
    When used clicks on InputForm
    Then it displayed list of "<menu>" user actions

    Examples: 
      | menu            |
      | Valid           |
      | Invalid         |
      | Partially Valid |
