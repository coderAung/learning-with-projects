drop database if exists to_do;

create database to_do;

use to_do;

create table user(
	id int primary key auto_increment,
	name varchar(255) not null,
	email varchar(255) not null,
	password varchar(255) not null,
	created_at date default current_timestamp,
	updated_at date
);

create table task(
	id int primary key auto_increment,
	name varchar(255) not null,
	description text,
	created_at date default current_timestamp,
	updated_at date,
	user_id int not null,
	foreign key (user_id) references user (id)
);