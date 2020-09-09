create database HandsOn;
use HandsOn;
CREATE TABLE Programmers
( emp_No numeric(5),
  LastName varchar(30),
  FirstName varchar(30),
  Hiredate varchar(15),
  projID varchar(5),
  Language char(15),
  TaskNo numeric(2),
  Privilege char(25),
  CONSTRAINT emp_pk PRIMARY KEY(emp_No)
  );
INSERT INTO Programmers(emp_No,LastName,FirstName,Hiredate,projID,Language,TaskNo,Privilege)
  Values(201,'Gupta','Saurav','01/01/1995','NPR','VB',52,'Secret');
INSERT INTO Programmers VALUES(390,'Gosh','Pinky','01/05/1993','KCW','Java',11,'Topsecret');
INSERT INTO Programmers VALUES(789,'Agarwal','Praveen','08/31/1998','Rnc','VB',11,'Secret');
INSERT INTO Programmers VALUES(134,'Chaudhury','Supriya','07/15/1995','TIPPS','C++',52,'Secret');
INSERT INTO Programmers VALUES(896,'Jha','Ranjit','06/15/1997','KCW','Java',10,'TopSecret');
INSERT INTO Programmers (emp_No,LastName,FirstName,Hiredate,projID,Language,TaskNo) VALUES(345,'John','Peter','11/15/1999','TIPPS','Java',52);
INSERT INTO Programmers VALUES(563,'Anderson','Andy','08/15/1994','NITTS','C++',89,'Confidential');
SELECT * from Programmers; 
UPDATE Programmers SET projID = 'NITTS',Language = 'C++' WHERE emp_No = 201; 
DELETE from Programmers WHERE emp_No = 134;
SELECT * from Programmers;
