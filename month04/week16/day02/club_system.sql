create table clubs (
     id SERIAL primary key,
     name VARCHAR(150) unique not null,
     founded_date date default current_date,
     is_active boolean default true
  );   
create table members (
     id serial primary key,
     club_id int references clubs(id),
     email varchar(200) unique not null,
     full_name varchar(100) not null,
     subscription_fee numeric(10, 2) check (subscription_fee >= 0),
     joined_at timestamptz default now()
  ); 
alter table members add column phone varchar(20);
alter table members alter column full_name type varchar(250);
alter table clubs add column category varchar(50) default 'Genaral' not null;

alter table clubs add constraint check_category_lenght check (LENGTH(category) > 2);
insert into clubs (name, category, is_active)
values ('Chess Club', 'Board Games', TRUE);

select * from clubs;

insert into members (club_id, email, full_name, subscription_fee )
values
(1, 'tushig@email.com', 'tushig', 50000.00),
(1, 'nomin@gmail.com', 'Nomin', 50000.00);

select * from members;

truncate table members restart identity;

drop table clubs cascade;
select * from clubs;
drop table members;
drop database club_system;