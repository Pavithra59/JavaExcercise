CREATE TABLE Worldcity
(
City varchar(15),
Country varchar(25),
Continent varchar(30),
Latitude numeric(5,2),
NorthSouth char(1),
Longitude numeric(5,2),
EastWest char(1)
);
INSERT INTO Worldcity VALUES('Athens','Greece','Europe',37.59,'N',23.44,'E');
INSERT INTO Worldcity VALUES('Atlanda','United States','North America',33.45,'N',84.23,'W');
INSERT INTO Worldcity VALUES('Dallas','United States','North America',32.47,'N',96.47,'W');
INSERT INTO Worldcity VALUES('Nashville','United States','North America',36.09,'N',86.46,'W');
INSERT INTO Worldcity VALUES('Victoria','Canada','North America',43.25,'N',123.21,'W');
INSERT INTO Worldcity VALUES('Peterborough','Canada','North America',44.18,'N',79.18,'W');
INSERT INTO Worldcity VALUES('Vancouver','Canada','North America',49.18,'N',123.04,'W');
INSERT INTO Worldcity VALUES('Toleda','United States','North America',41.39,'N',83.82,'W');
INSERT INTO Worldcity VALUES('Warsaw','Poland','Europe',52.15,'N',21.00,'E');
INSERT INTO Worldcity VALUES('Lima','Peru','South America',12.03,'S',77.03,'W');
INSERT INTO Worldcity VALUES('Rio De Janeiro','Brazil','South America',22.43,'s',43.13,'W');
INSERT INTO Worldcity VALUES('Santiago','Chile','South America',33.27,'S',70.40,'W');
INSERT INTO Worldcity VALUES('Bogota','Colombia','South America',04.36,'N',74.05,'W');
INSERT INTO Worldcity VALUES('Buenos Arires','Argentina','South America',34.36,'S',58.28,'W');
INSERT INTO Worldcity VALUES('Quito','Ecuador','South America',00.13,'S',78.30,'W');
INSERT INTO Worldcity VALUES('Caracas','Venezula','South America',10.30,'N',66.56,'W');
INSERT INTO Worldcity VALUES('Madras','India','Asia',28.36,'N',77.12,'E');
INSERT INTO Worldcity VALUES('Bombay','India','Asia',18.58,'N',72.50,'E');
INSERT INTO Worldcity VALUES('Manchester','England','Europe',51.30,'N',0.0,null);
INSERT INTO Worldcity VALUES('Moscow','Russia','Europe',55.45,'N',37.35,'E');
INSERT INTO Worldcity VALUES('Paris','France','Europe',48.52,'N',2.20,'E');
INSERT INTO Worldcity VALUES('Shenyang','China','Asia',41.48,'N',123.27,'E');
INSERT INTO Worldcity VALUES('Cairo','Egypt','Africa',30.03,'N',31.15,'E');
INSERT INTO Worldcity VALUES('Tripli','Lybia','Africa',32.54,'N',13.11,'E');
INSERT INTO Worldcity VALUES('Beijing','China','Asia',39.56,'N',116.24,'E');
INSERT INTO Worldcity VALUES('Rome','Italy','Europe',41.54,'N',12.29,'E');
INSERT INTO Worldcity VALUES('Tokyo','Japan','Asia',35.42,'N',139.46,'E');
INSERT INTO Worldcity VALUES('Sydney','Australia','Australia',33.52,'S',151.13,'E');
INSERT INTO Worldcity VALUES('Sparta','Greece','Europe',37.05,'N',22.27,'E');
INSERT INTO Worldcity VALUES('Madrid','Spain','Europe',40.24,'N',3.14,'W');
SELECT * FROM Worldcity;
SELECT DISTINCT Country,Continent from Worldcity;
SELECT City,Country FROM Worldcity WHERE City like 'R%';
SELECT City,Country FROM Worldcity WHERE City like '%A';
SELECT City,Country FROM Worldcity WHERE City like 'M_____';
SELECT City,Country FROM Worldcity WHERE City like '_A%';

SELECT Max(Price) from Items;
SELECT Min(Price) from Orders O,Items I WHERE O.ItemId = I.ItemId; 
SELECT city,count(city) as NumberofPerson from customer GROUP BY city;