CREATE TABLE books (
    id SERIAL PRIMARY KEY,
    title VARCHAR(200) NOT NULL,
    author VARCHAR(100),
    price NUMERIC(10, 2),
    published_year INT
);

INSERT INTO books (title, author, price, published_year) VALUES
    ('Clean Code', 'Robert Martin', 45000, 2008),
    ('The Pragmatic Programmer', 'Andy Hunt', 52000, 1999),
    ('Design Patterns', 'Gang of Four', 61000, 1994),
    ('Refactoring', 'Martin Fowler', 48000, 2018),
    ('Head First Java', 'Kathy Sierra', 39000, 2022);
select * from books;

update books set price = 55000 where id = 3; 

update  books set  published_year = 2023 where id = 5;



insert  into books (title, author, price, published_year) values
      ('Spring Boot up & running', 'Mark Heckler', 50000, 2021);

update books set title = 'Spring Boot & Running', price = 60000 where 
id = 6;
delete from books where id = 5;

delete from books where id = 4;
delete from books where id = 2;