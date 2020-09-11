use HandsOn;

SELECT Fname,city,country from customer where city='Chennai' or city='Salem' or city='Madurai';
SELECT c.custId,Fname,Lname,DateFirstPurchased,Itemname,Price from Items,customer c inner join Orders o ON c.custId = o.CustId where Items.ItemId = o.ItemId;
SELECT * from Orders where ItemId =(SELECT ItemId from Items where Itemname = 'Dove soap');

Select Itemname,Price*Minqty,Price*Maxqty from Orders,Items where Orders.ItemId = Items.ItemId and Price*Maxqty > 190;
SELECT CustId, Count(CustId),SUM(Quantity) FROM Orders GROUP BY CustId;
SELECT city,count(city) from customer where city IN (Select city from customer group by city HAVING count(*)>1) GROUP BY city;
