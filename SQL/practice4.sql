SELECT * FROM admavin_pinlocation.revinfo;
select * from hibernate_sequence;
show databases;
use admavin_pinlocation;
select * from user_list;
show tables;
select * from details;
select user_list.id,user_list.first_name,user_list.last_name,user_list.mobile_no,user_list.email_address,user_list.city,user_list.state from user_list where id=1;
delete from user_list where id between "4" and "13";