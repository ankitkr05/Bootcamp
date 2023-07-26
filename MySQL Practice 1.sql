show databases;
use bootcamp;
create table Manufacturers (
id int,
proName varchar(255) not null,
primary key (id)
);

create table Products (
id int,
proName varchar(255) not null,
price decimal not null,
manufacturer int not null,
primary key (id),
foreign key (manufacturer) references Manufacturers (id)
);

insert into Manufacturers(id,proName) values(1,'Sony');
insert into Manufacturers(id,proName) values(2,'Samsung');
insert into Manufacturers(id,proName) values(3,'HP');
insert into Manufacturers(id,proName) values(4,'Lenovo');
insert into Manufacturers(id,proName) values(5,'Xiaomi');
insert into Manufacturers(id,proName) values(6,'Apple');

insert into Products(id,proName,price,manufacturer) values(1,'Hard drive',240,5);
insert into Products(id,proName,price,manufacturer) values(2,'Memory',120,6);
insert into Products(id,proName,price,manufacturer) values(3,'ZIP drive',150,4);
insert into Products(id,proName,price,manufacturer) values(4,'Floppy disk',5,6);
insert into Products(id,proName,price,manufacturer) values(5,'Monitor',240,1);
insert into Products(id,proName,price,manufacturer) values(6,'DVD drive',180,2);
insert into Products(id,proName,price,manufacturer) values(7,'CD drive',90,2);
insert into Products(id,proName,price,manufacturer) values(8,'Printer',270,3);
insert into Products(id,proName,price,manufacturer) values(9,'Toner cartridge',66,3);
insert into Products(id,proName,price,manufacturer) values(10,'DVD burner',180,2);

select proName from Products;
select proName, price from Products;
select proName from Products where price <= 200;
select * from Products where price between 60 and 120;
select proName, (price*100) from Products;
select avg(price) from Products;
select avg(price) from Products where id=2;
select count(id) from Products where price>=180;
select proName, price from Products where price>=180 order by price desc, proName asc;

