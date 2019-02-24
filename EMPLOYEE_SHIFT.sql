DROP DATABASE IF EXISTS SWISS_SHIFTS;
CREATE DATABASE SWISS_SHIFTS;
USE SWISS_SHIFTS;

CREATE TABLE shifts(
symbol VARCHAR(255) PRIMARY KEY,
time VARCHAR(255) NOT NULL,
wokingHours int NOT NULL,
pause int not NULL

);
employee
CREATE TABLE employee(
id int AUTO_INCREMENT PRIMARY KEY,
positionInFirm ENUM('loader','ramp agent','check-in agent','driver','cleaner'),
nameOfEmployee VARCHAR(255) NOT NULL,
egn VARCHAR(255) NOT NULL UNIQUE,
shift VARCHAR(255) NOT NULL,
CONSTRAINT FOREIGN KEY(shift) REFERENCES shifts(symbol) 
);


