Feature: login
Scenario: Successful login with valid credentials
Given user launch chrome browser
When user opens "http://localhost:100/"
And user enters username as "admin" and password as "admin"
And user press on login button
Then page title should be "vtiger CRM - Commercial Open Source CRM"
Then user clicks on logout link
And close browser