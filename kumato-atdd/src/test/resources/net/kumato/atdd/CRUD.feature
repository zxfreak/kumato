Feature: CRUD
	As an User
	I want to Create, Read, Update and Delete contacts
	So I can build and maintain my contact book
	
Scenario: Empty Database
	Given an empty database
	Then the database has 0 contacts
