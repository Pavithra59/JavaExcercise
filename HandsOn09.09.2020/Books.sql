Create TABLE Books
(
BookId numeric(4),
Title char(10),
TopicId char(10),
PublisherName char(30),
PlaceofPublication char(30),
Price numeric(4),
PurchaseDate Date,
ShelfNO char(3),
 CONSTRAINT BookPK PRIMARY KEY(BookId)
);
INSERT INTO Books VALUES(8293,'DBMS','DB1','Prentice Hall','Mumbai',255,'1995-01-01','S11');
INSERT INTO Books VALUES(5645,'DBMS','DB1','Pearson Education','Mumbai',655,'1993-01-05','S12');
INSERT INTO Books VALUES(6565,'C','C1','TMH','Mumbai',840,'1998-08-31','S66');
INSERT INTO Books VALUES(6567,'C++','Cplus1','ABC Publishers','Delhi',300,'1995-07-15','S77');
INSERT INTO Books VALUES(4576,'JAVA','JAVA1','Guru Govind Publication','Delhi',500,'1997-06-15','S87');
INSERT INTO Books VALUES(3433,'OOPS','OOPS1','Dave Publishers','Pune',600,'1999-11-15','S56');
INSERT INTO Books VALUES(4655,'SAD','SAD1','Sajan Publishers','Cochin',700,'1994-08-15','S76');
UPDATE Books SET ShelfNO = 'S10' WHERE Title = 'DBMS'; 
SELECT * FROM Books;
