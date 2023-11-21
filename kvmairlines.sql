DROP DATABASE IF EXISTS KVMAIRLINES;
CREATE DATABASE KVMAIRLINES; 
USE KVMAIRLINES;

DROP TABLE IF EXISTS USERS;
CREATE TABLE USERS (
	firstname	varchar(25),
	lastname	varchar(25),
	userid		int,
    email		varchar(25),
	address 	varchar(25),
    type_user		varchar(25),
	primary key (userid)
);

DROP TABLE IF EXISTS ACCOUNT;
CREATE TABLE ACCOUNT (
	username	varchar(25),
	password_u	varchar(25),
	userid		int,
	primary key (userid)
);
INSERT INTO ACCOUNT (AnimalID, AnimalNickname, AnimalSpecies) VALUES
('kenzy', 'kenzy', 1);







DROP TABLE IF EXISTS CREW;
CREATE TABLE CREW (
	firstname	varchar(25),
	lastname	varchar(25),
	crewID		int,
    type_crew	varchar(25),
	primary key (crewID)
);



DROP TABLE IF EXISTS STAFF;
CREATE TABLE STAFF (
	flightID	varchar(25),
	crewID		int,
	primary key (flightID)
);


DROP TABLE IF EXISTS AIRCRAFT;
CREATE TABLE AIRCRAFT (
	aircraftID	int,
    model	varchar(25),
    name	varchar(25),
	primary key (aircraftID)

);




DROP TABLE IF EXISTS FLIGHTS;
CREATE TABLE FLIGHTS (
	FlightID	int not null AUTO_INCREMENT,
    destination		varchar(25),
    origin	varchar(25),
    date_leaves	varchar(25),
    aircraft	varchar(25),
	primary key (FlightID)

);