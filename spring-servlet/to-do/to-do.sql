drop database if exists to_do;

create database to_do;

use to_do;

create table user(
	id int primary key auto_increment,
	name varchar(255) not null,
	email varchar(255) not null,
	password varchar(255) not null,
	created_at datetime default CURRENT_TIMESTAMP,
	updated_at datetime
);

create table task(
	id int primary key auto_increment,
	name varchar(255) not null,
	description text,
	created_at datetime default CURRENT_TIMESTAMP,
	updated_at datetime,
	user_id int not null,
	foreign key (user_id) references user (id)
);