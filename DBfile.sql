create database if not exists resms;
use resms;


-- admin_login_data table
create table if not exists admin_login_data
(admin_user_name varchar(10) not null primary key,
password varchar(8));
-- agent_login_data table
create table if not exists agent_login_data
(agent_user_name varchar(10) not null primary key,
password varchar(8));
-- owner_login_data table
create table if not exists owner_login_data
(owner_user_name varchar(10) not null primary key,
password varchar(8));

-- admin table
create table if not exists admin_table
(admin_id int NOT NULL auto_increment primary key,
first_name varchar(10),
last_name varchar(10),
admin_user_name varchar(10) not null,
password varchar(8));
-- owner table
create table if not exists owner
(owner_id int NOT NULL auto_increment primary key,
first_name varchar(10),
last_name varchar(10),
owner_user_name varchar(10) not null,
password varchar(8),
phone bigint,
email varchar(25));
-- agent table
create table if not exists agent
(agent_id int NOT NULL auto_increment primary key,
first_name varchar(10),
last_name varchar(10),
agent_user_name varchar(10) not null,
password varchar(8),
location varchar(10));
-- client table
create table if not exists client
(client_id int not null auto_increment primary key,
first_name varchar(10),
last_name varchar(10),
phone bigint,
email varchar(25));
-- property table
create table if not exists property
(p_id int NOT NULL auto_increment primary key,
p_type varchar(10),
owner_id varchar(10),
address varchar(10),
bathroom int,
bedrooms int,
balcony int,
garage int,
description varchar(100));

-- assigned table
create table if not exists assigned
(agent_id int,
agent_name varchar(10),
owner_name varchar(10),
owner_id int,
p_id int);




