
*********************************************ShowCaseYourSkills:*******************************************

ShowCaseYourSkills project is developed from scratch using Spring MVC, Maven, Tomcat Server, MySQl Workbench, JDBC, JQuery, JSP, Apache Tiles, CSS, log4j, JUnit.

This app can be used to show case skills of users.

Features:
1) Login page 				- passwords are encrypted using spring-security
2) Create Account page 		- JQuery is used to validate if the password and confirm password field values are same.
3) List of skills page 		- displays the list of skills of all the users of the app.
4) Adding new skill page 	- various validations on the form using annotations.
5) Page Layout (view) 		- Apache tiles is used to design page layout of various JSP files.
6) Logs						- User activity logs are captured using log4j.
7) Test cases				- Unit test cases are written using JUnit framework.

***********************************************************************************************************

How to setup the project?
IDE		: Install eclipse, add maven and spring ide plugins.
Server	: Setup Tomcat server.
DB		: Setup MySQL workbench, add a database called spring. Inside spring database add the following three tables:
1) user with columns username, password, enabled, email
CREATE TABLE `user` (
  `username` varchar(60) NOT NULL,
  `password` varchar(80) NOT NULL,
  `enabled` tinyint(1) NOT NULL DEFAULT '1',
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`username`)
)

2) authorities with columns username and authority
CREATE TABLE `authorities` (
  `username` varchar(60) NOT NULL,
  `authority` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`username`)
)

3) offers with columns name, email and text.
CREATE TABLE `offers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `email` varchar(60) NOT NULL,
  `text` text NOT NULL,
  PRIMARY KEY (`id`)
)


***********************************************************************************************************
How to run the project?
Right click on the project and select "run on server". 
Then this can be accessed on any browser using the following link:  "http://localhost:8080/mvc/"




