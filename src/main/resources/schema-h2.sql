DROP TABLE IF EXISTS Post;

CREATE TABLE Post(
zeNo SERIAL,
zeTime timestamp,
userEmail varchar(50),
title varchar(80),
zeText text,
PRIMARY KEY (zeNo)); 

DROP TABLE IF EXISTS Usager;

CREATE TABLE Usager(
id SERIAL,
emailAddress varchar(50),
shaPassword bytea,
fullName varchar(50),
creationDate timestamp,
permLevel varchar(10),
salt bytea,
lastModifDate timestamp,
lastModifUser varchar(50));
