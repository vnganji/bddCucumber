@staging
Feature: login Feature for staging

  Background: 
    Given user navigates to easyselenium home page
    When used clicks on InputForm

@prod
  Scenario: user login to easyslenium and validate different inputform menu options for statging valid
    Then it displayed list of "valid" user actions
@staging
  Scenario: user login to easyslenium and validate different inputform menu options for statging invalid
    Then it displayed list of "Invalid" user actions
