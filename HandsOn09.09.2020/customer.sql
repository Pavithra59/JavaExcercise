CREATE TABLE customer
(
custId int,
Fname char(30),
Lname char(30),
Address char(50),
phoneNo numeric(10) NOT NULL,
city char(20),
country char(20),
DateFirstPurchased date,
supplierId int,
constraint cust_pk PRIMARY KEY(custId),
constraint fk_supplier FOREIGN KEY(supplierId) REFERENCES Supplier(supplierId)
);
INSERT INTO customer VALUES(1001,'Das','Jeyaseelan','119,park Avenue,II street','9841093428','Coimbatore','India','2004-01-10',1);
INSERT INTO customer VALUES(2001,'Gopi','Govindraj','241,I floor,Kamaraj street,Madippakkam','9444124590','Chennai','India','2005-03-25',4);
INSERT INTO customer VALUES(1201,'Dilip','Kishore','43,II Avenue,Anna Nagar','9997234534','Bangalore','India','2004-08-20',2);
INSERT INTO customer VALUES(1300,'Aanand','Chowdhury','42/1 sector 1,II street','9841054348','Bangalore','India','2005-05-15',2);
INSERT INTO customer VALUES(1220,'Chandra','Nagarajan','83,lag bagh','9841067235','Bangalore','India','2006-02-12',4);
INSERT INTO customer VALUES(1221,'Abhishek','Kumar','13,kishori park','9444762390','Chennai','India','2004-05-15',1);
INSERT INTO customer VALUES(1320,'Nikhil','Pandit','218,alwaanya street','9444892309','Salem','India','2006-04-21',3);
INSERT INTO customer VALUES(1222,'Meenu','Monica','C11,chruch road','9841056342','Trichy','India','2004-08-30',1);
INSERT INTO customer VALUES(1225,'Pavan','Kumar','128/A,North street','9993478213','Madurai','India','2004-08-18',4);
SELECT * from customer; 
CREATE TABLE Supplier
(
supplierId int,
Sname char(30),
Scity char(30),
Sphone numeric(10) NOT NULL,
Email char(50) UNIQUE,
constraint supplier_pk PRIMARY KEY(supplierId)
);
INSERT INTO Supplier VALUES(1,'Dilip','Chennai','8999900000','dilip@abc.co.in');
INSERT INTO Supplier VALUES(2,'Tarun','Madurai','8999911111','tarun@xyzl.com');
INSERT INTO Supplier VALUES(3,'Naresh','Coimbatore','8999922222','g.naresh@xyzl.com');
INSERT INTO Supplier VALUES(4,'Ganesh','Trichy','8999933333','Ganesh_83@ijk.com');
SELECT * FROM Supplier;
Select * From customer where city = 'Chennai';
Select * from customer where supplierId = 2;
Select custId,Fname,Lname from customer where DateFirstPurchased>='2005-01-01';
Select * from Supplier where Scity = 'Coimbatore';
Select * from Supplier where Sname like 'G%';
Select * from customer where Lname not like '%e%'; 
Select * from customer where DateFirstPurchased BETWEEN '2006-01-01' AND '2006-12-31' ORDER BY DateFirstPurchased DESC;