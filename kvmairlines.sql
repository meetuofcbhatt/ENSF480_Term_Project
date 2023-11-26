DROP DATABASE IF EXISTS KVMCAIRLINES;
CREATE DATABASE KVMCAIRLINES; 
USE KVMCAIRLINES;

DROP TABLE IF EXISTS USERS;
CREATE TABLE USERS (
	firstname	varchar(25),
	lastname	varchar(25),
	userid		int,
    email		varchar(25),
	address 	varchar(25),
	primary key (userid)
);

DROP TABLE IF EXISTS REG_USERS;
CREATE TABLE REG_USERS (
	userid 			int,
	username		varchar(25),
	pass			varchar(25),
	registerid		int,
    email			varchar(25),
	address 		varchar(25),
    notifications	varchar(25),
	primary key (userid)
);



DROP TABLE IF EXISTS AGENTS;
CREATE TABLE AGENTS (
	userid		int,
	firstname	varchar(25),
	lastname	varchar(25),
	agentid		int,
	companyname varchar(25),
	primary key (userid)
);

DROP TABLE IF EXISTS ADMINS;
CREATE TABLE ADMINS (
	userid		int,
	username	varchar(25),
	pass		varchar(25),
	adminid		int,
	primary key (userid)
);


DROP TABLE IF EXISTS CREW;
CREATE TABLE CREW (
	crewID		int,
    crewnum		varchar(25),
	primary key (crewID)
);


DROP TABLE IF EXISTS STAFF;
CREATE TABLE STAFF (
	staffID		int,
    crewID		int,
	firstName varchar(25),
	stafftype varchar(25),
	primary key (staffID)
);

DROP TABLE IF EXISTS FLIGHTS;
CREATE TABLE FLIGHTS (
	flightID		int not null AUTO_INCREMENT,
    flightName		varchar(25),
    destination		varchar(25),
    origin			varchar(25),
    date_leaves		date,
    aircraftID		int,
	crewID			int,
	primary key (flightID)

);

INSERT INTO FLIGHTS(flightName, destination, origin, date_leaves, aircraftID, crewID) VALUES
("WS1400", "Les Vegas", "Calgary", "2023-12-31", 0, 0),
("WS350", "Regina", "Calgary", "2023-12-16", 0, 0),
("AC8140", "Edmonton", "Calgary", "2023-12-31", 1, 1),
("WS676", "Toronto", "Calgary", "2023-12-16", 1, 1),
("AC225", "Vancouver", "Calgary", "2023-12-31", 2, 2),
("AC150", "Toronto", "Calgary", "2023-12-16", 2, 2);

DROP TABLE IF EXISTS BOOKING;
CREATE TABLE BOOKING (
	userid			int,
	flightid		int,
	seatid 			int,
	primary key (seatid, userid)
);

DROP TABLE IF EXISTS SEATS;
CREATE TABLE SEATS(
	seatid 			int not null AUTO_INCREMENT,
    aircraftID		int,
    columnLetter	varchar(1),
    rowNumber		int,
    seatStatus		bool,#0 is False, 1 is True.
    seatType		varchar(1),#B: business, C: comfert, R: regular.
    primary key(seatID, aircraftID)
);

INSERT INTO SEATS(aircraftID, columnLetter, rowNumber, seatStatus, seatType) VALUES
(0, "B", 1, 0, "B"),
(0, "C", 1, 0, "B"),
(0, "B", 2, 0, "C"),
(0, "C", 2, 0, "C"),
(0, "D", 2, 0, "C"),
(0, "A", 3, 0, "R"),
(0, "B", 3, 0, "R"),
(0, "C", 3, 0, "R"),
(0, "D", 3, 0, "R"),
(0, "B", 4, 0, "R"),

(1, "B", 1, 0, "B"),
(1, "C", 1, 0, "B"),
(1, "B", 2, 0, "C"),
(1, "C", 2, 0, "C"),
(1, "D", 2, 0, "C"),
(1, "A", 3, 0, "R"),
(1, "B", 3, 0, "R"),
(1, "C", 3, 0, "R"),
(1, "D", 3, 0, "R"),
(1, "B", 4, 0, "R"),

(2, "B", 1, 0, "B"),
(2, "C", 1, 0, "B"),
(2, "B", 2, 0, "C"),
(2, "C", 2, 0, "C"),
(2, "D", 2, 0, "C"),
(2, "A", 3, 0, "R"),
(2, "B", 3, 0, "R"),
(2, "C", 3, 0, "R"),
(2, "D", 3, 0, "R"),
(2, "B", 4, 0, "R");

DROP TABLE IF EXISTS AIRCRAFTS;
CREATE TABLE AIRCRAFTS (
	aircraftID		int not null AUTO_INCREMENT,
    model			varchar(25),
	primary key (aircraftID)

);

INSERT INTO AIRCRAFTS(model) VALUES
("Boeing 787"),
("Boeing 777"),
("Boeing B747");




