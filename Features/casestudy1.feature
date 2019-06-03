Feature: New user Register into TestmeApp

Scenario: Registration as New user in TestMeApp
Given User Lanchues TestMeApp And Enter into signin page
When User Enters New UserName as "Melinda"
When  User Enters  FirstName as "Hari"
When User Enters LastName as "S"
When User Enters Password as "1234567" And confirm password as "1234567"
When User Selects Gender as "Female"
When User Enters E-Mail as"h123@gmail.com"
When User Enters Mobile Number as "9876654322"
When User Enters DOB as "12/27/1996"
When User Enters Address as "Accenture CDC2"
When User Selects Security Question as "What is your Pet Name?"
When User Enters Answers as "DOBBY"
Then User clicks on Submit
