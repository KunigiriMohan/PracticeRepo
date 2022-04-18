create database payroll_services;
use payroll_services; 

select * from employees_list;
drop table employees_list;
show tables;
drop table employee_department_list;
delete from employees_list where emp_id between 30 and 271;
create database contact_db;
use contact_db;
select * from person_list;
drop table user_list;
drop table person_list;

use book_store_home_db;
show tables;
select * from book_list;
select * from book_list order by book_price ASC;
drop table book_list;
delete from user_list where id between 10  and 15;
update book_list set quantity=2 where book_id=372;
drop table order_details;
drop table book_list;
show tables;
use book_store_buy_now;
drop table order_details_books;
use book_store_cart_db;
select * from order_details;
select * from book_list;
update book_list set order_id =123456 where book_id=2;
select * from user_list;
select * from book_list where book_name='Dont Make Me Think';
select count(id) from book_list;
alter table book_list  yt.total_book_price= (yt.quantity * yt.book_price);
use book_store_buy_now;

use book_store_user_data;
select * from user_list;
delete from user_list where id=19
create database book_store_wishlist_db;
use book_store_wishlist_db;
show tables;
select * from book;
drop table book;