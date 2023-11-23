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
	primary key (userid)
);

DROP TABLE IF EXISTS REG_USERS;
CREATE TABLE REG_USERS (
	username	varchar(25),
	password	varchar(25),
	registerid		int,
    email		varchar(25),
	address 	varchar(25),
    notifications		varchar(25),
	primary key (userid)
);



DROP TABLE IF EXISTS AGENTS;
CREATE TABLE AGENTS (
	firstname	varchar(25),
	lastname	varchar(25),
	agentid		int,
	companyname varchar(25),
	primary key (userid)
);

DROP TABLE IF EXISTS ADMIN;
CREATE TABLE ADMIN (
	username	varchar(25),
	password	varchar(25),
	adminid		int,
	primary key (userid)
);


DROP TABLE IF EXISTS CREW;
CREATE TABLE CREW (
	crewID		int,
    crewnum	varchar(25),
	primary key (crewID)
);


DROP TABLE IF EXISTS STAFF;
CREATE TABLE STAFF (
	staffID		int,
    crewID		int,
	name varchar(25),
	stafftype varchar(25),
	primary key (crewID)
);

DROP TABLE IF EXISTS FLIGHTS;
CREATE TABLE FLIGHTS (
	FlightID	int not null AUTO_INCREMENT,
    destination		varchar(25),
    origin	varchar(25),
    date_leaves	varchar(25),
    aircraft	varchar(25),
	crewID		varchar(25),
	primary key (FlightID)

);


DROP TABLE IF EXISTS BOOKING;
CREATE TABLE BOOKING (
	staffID		int,
    crewID		int,
	name varchar(25),
	stafftype varchar(25),
	primary key (crewID)
);














DROP TABLE IF EXISTS AIRCRAFT;
CREATE TABLE AIRCRAFT (
	aircraftID	int,
    model	varchar(25),
    name	varchar(25),
	primary key (aircraftID)

);




