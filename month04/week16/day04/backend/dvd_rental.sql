select * from actor;

select first_name from actor;

select first_name, last_name from actor;

select first_name as "First Name", last_name "Last Name" from actor;

select * from city;
select city_id, city from city;

select country from country;

select * from film;

select * from country limit 10;

select * from country  order by country asc limit 10;

select * from city order by city_id asc limit 10;

select * from film order by title desc limit 20;

select first_name || ' ' || last_name as "Full name" from actor;

select distinct first_name from actor;



select * from country where country = 'Afghanistan';

select * from actor where first_name = 'Warren';

select title, description, rating from film where rating = 'R';

select first_name, last_name, email from customer where active = 0;

select * from rental where return_date is null;

select title, length, rental_rate from film where rental_rate < 1 and length > 180;

select * from actor where last_name in ('Allen', 'Chase', 'Davis');

select  payment_id, amount, payment_date from payment where payment_date:: date in
('2007-02-15', '2007-02-16');

select * from film where film_id not in (1, 2, 3) order by film_id asc limit 20;

select * from payment where payment_id between 17500 and 17505; 