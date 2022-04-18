SELECT * FROM admavin_pinlocation.user_details_aud;
use supermart_db;
describe table country;
select * from country;
show tables;
select * from countries;
select * from customers;
select * from locations;
select * from dependents;
select * from jobs;
select * from employees;
select *,count(employee_id) from employees;

select * from departments;
select * from regions;
select data_type from information_schema.columns where table_schema = 'supermart_db' and table_name = 'country';
select * from countries where country_id='AR';
