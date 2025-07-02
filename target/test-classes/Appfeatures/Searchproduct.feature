Feature: Search Faunctionality

Scenario: Search Product
Given the user is at the Homepage
When user searches "MacBook"
Then user should be able to see "MacBook", "MacBook Air" and "MacBook Pro"