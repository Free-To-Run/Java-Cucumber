#Author: Ratnadip Chaudhuri
#Keywords Summary : Free Sample Feature file
#Feature: Google Search Page.
#Scenario: Validate Front UI, Validate Term Search functionality, Validate Person Search.

@tag
Feature: Google Search Page.

  @regression
  Scenario: Validate Front UI.
    Given Launch Application and wait for the page to load.
    Then Validate the Google Logo.
    And Validate that Search field is available.
    And Validate that "Google Search" button is available.
    And Validate that "I'm Feeling Lucky" button is available. 