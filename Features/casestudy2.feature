Feature: login

Scenario Outline: Login

Given Url
When user enters "<username>"
When user enters  the "<password>"
Then login

Examples:

|username|password|
|AlexUser|Alex@123|