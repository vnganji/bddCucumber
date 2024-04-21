@prod
Feature: login Feature for prod

  Scenario Outline: user login to easyslenium and validate different inputform menu options for production
    Given user navigates to easyselenium home page
    When used clicks on InputForm
    Then it displayed list of "<menu>" user actions for production

    Examples: 
      | menu                 |
      | Valid prod           |
      | Invalid prod         |
      | Partially Valid prod |
