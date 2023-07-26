create database bootcamp;
show databases;
use bootcamp;
create table empy(id int,name char(30),dept varchar(30),age int,salary float);
desc empy;
insert into empy values(1,'ankit','gnt',22,50000);
insert into empy values(2,'ayush','tse',22,51000);
insert into empy values(3,'adarsh','data',22,52000);
insert into empy values(4,'kapa','gnt',22,53000);
select * from empy;
select id,name from empy;
select id,name,age,salary from empy;

update empy set dept='developer' where id=1;
select * from empy;

update empy set salary=48000 where id=2;

select * from empy;
update empy set dept='cloud' where id=4;
select * from empy;
select name,salary, salary+5000 as bonus, salary/30 as perDaySalary from empy;
select * from empy where dept='gnt';
select * from empy where dept<>'gnt';
select * from empy where dept<>'gnt' and age<30;
update empy set age=24 where id=2;
select * from empy;
update empy set age=23 where id=4;
select * from empy;
select * from empy where dept<>'gnt' and age>22;
select * from empy where dept<>'gnt' or age>22;
select * from empy where salary between 48000 and 52000;
select * from empy where not dept='gnt';
select * from empy where name like '%_a%';
select * from empy where name like '_a%';
select * from empy where name like 'a%';
select * from empy where name like '%a';
select * from empy where name like '_n%';
select * from empy where name like '__u%';
select * from empy where name like 'a__%';
insert into empy values(5,'pratyush','devops',25,41000);
insert into empy values(6,'gaurav','developer',27,62000);
select * from empy order by name;
select * from empy;
select min(salary) from empy;
select max(salary) from empy;
select sum(salary) from empy;
select avg(salary) from empy;
select count(salary) from empy;

select id, name, upper(name), lower(name), length(name) from empy;
select min(salary), max(salary), avg(salary) from empy;

select round(35000.788,2);

select id from empy group by id;
select dept from empy;
select dept from empy group by dept;
update emp set dept='gnt' where id=1;
select dept from empy;
select dept from empy group by dept;
select * from empy;
update empy set dept='gnt' where id=1;
select * from empy;
select dept from empy;
select dept from empy group by dept;

select dept,sum(salary),count(id) from empy group by dept;
update empy set dept='gnt' where id=2;
update empy set dept='tse' where id=6;
update empy set dept='tse' where id=5;
select * from empy;
select dept,sum(salary),count(id) from empy group by dept order by count(id);
select dept,sum(salary),count(id) from empy group by dept order by count(id) desc;
select dept,sum(salary),count(id) from empy
group by dept
having count(id)>=2
order by count(id) desc;

select * from empy
where salary > (select salary from empy where name='ankit');

select * from empy
where salary > (select salary from empy where dept='cloud');

select * from empy where salary in(52000,53000,62000);

select * from empy 
where salary > any
(select salary from empy where dept='gnt');

select * from empy 
where salary > all
(select salary from empy where dept='gnt');

CREATE TABLE emptest LIKE empy;
desc emptest;

create table empytest
(
id int not null primary key,
name varchar(30) not null,
dept varchar(30) default'bench',
age int check(age>22),
mobileNo varchar(10) unique,
emailid varchar(30) unique
);

desc empytest;