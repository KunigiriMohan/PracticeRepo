show databases;
show tables;
use classicmodels;
 select * from orderdetails;
select orderNumber,sum(priceEach) from orderDetails group by orderNumber; 
select * from customers where customerName like'A%';
select * from orderdetails;
select * from orders;
select * from orderdetails group by orderNumber having sum(priceEach)>100;
select *, case when sum(priceEach)<40 then 'lowPrice'when sum(priceEach)<100 then 'medium price' when sum(priceEach)<'150' then 'high price' else 'other'end as 'pricecategory' from orderdetails group by orderNumber;
select * from customers;
select * from employees;
select * from customers  where city='Paris' order by customerName;
select orders.orderNumber, orders.orderDate, orders.status,orderdetails.productCode, sum(orderdetails.quantityOrdered) as orderedQuantity from orders inner join orderdetails on orders.orderNumber=orderdetails.orderNumber group by orderNumber;
select orders.orderNumber, orders.orderDate, orders.status,orderdetails.productCode, sum(orderdetails.quantityOrdered) as orderedQuantity from orders left join orderdetails on orders.orderNumber=orderdetails.orderNumber group by orderNumber;
select orders.orderNumber, orders.orderDate, orders.status,orderdetails.productCode, sum(orderdetails.quantityOrdered) as orderedQuantity from orders right join orderdetails on orders.orderNumber=orderdetails.orderNumber group by orderNumber;
create table month_values (MM integer);
create table year_values (YYYY integer);
insert into month_values values	(1),(2),(3),(4),(5),(6),(7),(8),(9),(10),(11),(12);
insert into year_values values (2011),(2012),(2013),(2014),(2015),(2016),(2017),(2018),(2019);
select * from month_values;
select * from year_values;
select month_values.MM , year_values.YYYY from year_values ,month_values;
select * from customers  where city in ('Paris','Melbourne');
create table month (MM integer);
insert into month values	(1),(2),(3),(4),(5),(6),(7),(8),(9),(10),(11),(12);
select * from month_values except select * from month order by orderNumber;
select * from productlines;
select * from orders where orderNumber in (select orderNumber from orders where orderNumber between '10100' and '10150');
select orders.orderNumber, orders.orderDate, orders.status,b.productCode,sum(b.quantityOrdered)  from orders  left join (select orderNumber,productCode,quantityOrdered from orderdetails) as b on orders.orderNumber = b.orderNumber group by orderNumber ;
select orders.orderNumber, orders.orderDate, orders.status,(select priceEach from orderdetails where orderNumber=orderdetails.orderNumber group by orderNumber)  from orders group by orderNumber;
create view transport as select customers.customerNumber,customers.phone,customers.addressLine1,customers.city,customers.postalCode,orders.orderNumber,orders.orderDate,orders.status from customers left join orders on orders.customerNumber =customers.customerNumber order by customerNumber;
select * from transport;
drop view transport1;
select customerName , length(customerName) from customers;
select customerName , upper(customerName) from customers;
select * ,replace(country,'USA','United States of America') as countryNew from customers;
select trim(leading ' ' from ' Learning SQL ');
select trim(trailing ' ' from ' Learning SQL ');
select trim(both ' ' from ' Learning SQL ');
select customerName, addressLine1||' , '||state||' , '||country as address from customers;
select employeeNumber,firstName, upper(substring(firstName from 1 for 2)) as employeeGroup from employees ;
select orderNumber, string_agg(quantityOrdered,', ') from orderdetails group by orderNumber;