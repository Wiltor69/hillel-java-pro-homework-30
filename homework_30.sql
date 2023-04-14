create database homework30;
use homework30;
create table Product(
id int  PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(128),
price double
);
create table Cart(
id int  PRIMARY KEY AUTO_INCREMENT,
Product_id int,
FOREIGN KEY (Product_id) REFERENCES Product(id)
);

