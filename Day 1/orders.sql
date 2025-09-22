create database order_management;
use order_management;
create table orders(
order_id  int auto_increment primary key,
customer varchar(20) not null,
product varchar(20) not null,
quantity int not null,
price decimal(10.1) not null,
orderdate date not null,
status varchar(20) default "pending"
);
USE order_management;

INSERT INTO orders (customer, product, quantity, price, orderdate, status) VALUES
('Amit Sharma', 'Rice', 10, 45.0, '2025-09-01', 'delivered'),
('Priya Verma', 'Wheat Flour', 5, 38.0, '2025-09-03', 'shipped'),
('Ravi Kumar', 'Tea Powder', 2, 120.0, '2025-09-05', 'pending'),
('Neha Singh', 'Sugar', 8, 42.0, '2025-09-07', 'delivered'),
('Suresh Iyer', 'Cooking Oil', 3, 135.0, '2025-09-09', 'cancelled'),
('Pooja Patel', 'Dal (Toor)', 6, 95.0, '2025-09-10', 'shipped'),
('Rahul Mehta', 'Salt', 12, 18.0, '2025-09-12', 'delivered'),
('Sneha Reddy', 'Biscuits', 4, 25.0, '2025-09-14', 'pending'),
('Vikram Joshi', 'Spices Pack', 1, 150.0, '2025-09-16', 'delivered'),
('Anjali Nair', 'Milk Powder', 2, 180.0, '2025-09-18', 'shipped');

select * from orders;
select * from orders order by price ; 
select * from orders order by  price desc ;
select * from orders order by price limit 1 offset 1;
select * from orders where product="milk powder"; 
select min(price) as lowest_price from orders;
select max(price) as highest_price from orders;
select sum(price) as total from orders;
select * from orders where status in("pending","shipped","cancelled");
select count(*) as "total orders" from orders;
select count(*),status from orders group by status;
