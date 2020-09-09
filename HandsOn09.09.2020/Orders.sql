CREATE TABLE Orders
(
OrderId int,
OrderDate Date,
CustId int,
Quantity int,
ItemId int,
Constraint pk_orderId PRIMARY KEY(OrderID),
Constraint chk_quantity CHECK(Quantity>0),
constraint fk_ItemId FOREIGN KEY(ItemId) REFERENCES Items(ItemId)
);
INSERT INTO Orders VALUES(1,'2004-01-12',1001,30,25);
INSERT INTO Orders VALUES(2,'2005-01-06',1202,38,24);
INSERT INTO Orders VALUES(3,'2006-12-16',1220,10,22);
INSERT INTO Orders VALUES(4,'2004-05-21',1233,12,21);
Select * from Orders;
CREATE TABLE Items
(
ItemId int,
Itemname char(35) NOT NULL,
SupplierId int,
Minqty int NOT NULL,
Maxqty int NOT NULL,
Price numeric(5,2),
constraint pk_ItemId PRIMARY KEY(ItemId),
constraint fk1_supplier FOREIGN KEY(supplierId) REFERENCES Supplier(supplierId)
);
INSERT INTO Items VALUES(20,'Pears Soap',4,7,20,30.00);
INSERT INTO Items VALUES(21,'V.V.D. Coconut oil 200ml',2,8,15,79.00);
INSERT INTO Items VALUES(22,'Ponds Powder 400g',3,6,25,106.00);
INSERT INTO Items VALUES(23,'Reynolds pen-blue',1,10,30,15.00);
INSERT INTO Items VALUES(24,'Reynolds pen-black',1,10,30,16.00);
INSERT INTO Items VALUES(25,'Mysore sandal soap',4,7,25,25.00);
INSERT INTO Items VALUES(26,'Fair&lovely cream 50g',3,5,15,55.00);
INSERT INTO Items VALUES(27,'Rexono deo spray',2,5,20,100.00);
INSERT INTO Items VALUES(28,'Dove soap',4,7,15,85.00);
SELECT * FROM Items;

SELECT * FROM Orders where Quantity <=35;
Select * from Items where SupplierId= 4;
Select * from Items where SupplierId = 3 AND Minqty => 7 ORDER BY ItemId;