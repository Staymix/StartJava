-- create database
DROP DATABASE IF EXISTS jaegers;
CREATE DATABASE Jaegers;

\С jaegers;

DROP TABLE IF EXISTS jaegers;
CREATE TABLE Jaegers (
	id        SERIAL PRIMARY KEY,
	modelName TEXT,
	mark      INTEGER,
	height    NUMERIC(4,2),
	weight    NUMERIC(4,3),
	status    TEXT,
	origin    TEXT,
	launch    DATE,
	kaijuKill INTEGER
);

\i D:/soft/java/study/StartJava/src/com/startjava/lesson_5/init_db.sql
\i D:/soft/java/study/StartJava/src/com/startjava/lesson_5/queries.sql