CREATE TABLE agent (
	agent_id INT NOT NULL AUTO_INCREMENT,
	first_name varchar(10) NOT NULL,
	last_name varchar(10) NOT NULL,
	agent_user_name varchar(10) NOT NULL UNIQUE,
	location varchar(10) NOT NULL,
	PRIMARY KEY (agent_id)
);

CREATE TABLE owner (
	owner_id INT NOT NULL AUTO_INCREMENT,
	first_name varchar(10) NOT NULL,
	last_name varchar(10) NOT NULL,
	owner_user_name varchar(10) NOT NULL UNIQUE,
	phone BIGINT NOT NULL,
	email varchar(20) NOT NULL,
	PRIMARY KEY (owner_id)
);

CREATE TABLE client (
	client_id INT NOT NULL AUTO_INCREMENT,
	first_name varchar(10) NOT NULL,
	last_name varchar(10) NOT NULL,
	phone BIGINT NOT NULL,
	email varchar(20) NOT NULL,
	PRIMARY KEY (client_id)
);

CREATE TABLE admin_table (
	admin_id INT NOT NULL AUTO_INCREMENT,
	first_name varchar(10) NOT NULL,
	last_name varchar(10) NOT NULL,
	admin_user_name varchar(10) NOT NULL UNIQUE,
	PRIMARY KEY (admin_id)
);

CREATE TABLE property (
	p_id INT NOT NULL AUTO_INCREMENT,
	p_type varchar(10) NOT NULL,
	owner_id INT NOT NULL,
	address varchar(10) NOT NULL,
	bathrooms INT NOT NULL,
	bedrooms INT NOT NULL,
	balcony INT NOT NULL,
	garage INT NOT NULL,
	description varchar(100),
	PRIMARY KEY (p_id)
);

CREATE TABLE assigned (
	id INT NOT NULL AUTO_INCREMENT,
	agent_name varchar(10) NOT NULL,
	agent_id INT NOT NULL,
	owner_name varchar(10) NOT NULL,
	p_id INT NOT NULL,
	PRIMARY KEY (id)
);

CREATE TABLE admin_login_data (
	admin_user_name varchar(10) NOT NULL,
	password varchar(8) NOT NULL
);

CREATE TABLE agent_login_data (
	agent_user_name varchar(10) NOT NULL,
	password varchar(8) NOT NULL
);

CREATE TABLE owner_login_data (
	owner_user_name varchar(10) NOT NULL,
	password varchar(8) NOT NULL
);

CREATE TABLE appointment (
	ap_id INT NOT NULL AUTO_INCREMENT,
	agent_name varchar(10) NOT NULL,
	agent_id INT NOT NULL,
	client_name varchar(10) NOT NULL,
	client_id INT NOT NULL,
	PRIMARY KEY (ap_id)
);

ALTER TABLE property ADD CONSTRAINT property_fk0 FOREIGN KEY (owner_id) REFERENCES owner(owner_id) on delete cascade on update cascade;

ALTER TABLE assigned ADD CONSTRAINT assigned_fk0 FOREIGN KEY (agent_id) REFERENCES agent(agent_id) on delete cascade on update cascade;

ALTER TABLE assigned ADD CONSTRAINT assigned_fk1 FOREIGN KEY (p_id) REFERENCES property(p_id) on delete cascade on update cascade;

ALTER TABLE admin_login_data ADD CONSTRAINT admin_login_data_fk0 FOREIGN KEY (admin_user_name) REFERENCES admin_table(admin_user_name) on delete cascade on update cascade;

ALTER TABLE agent_login_data ADD CONSTRAINT agent_login_data_fk0 FOREIGN KEY (agent_user_name) REFERENCES agent(agent_user_name) on delete cascade on update cascade;

ALTER TABLE owner_login_data ADD CONSTRAINT owner_login_data_fk0 FOREIGN KEY (owner_user_name) REFERENCES owner(owner_user_name) on delete cascade on update cascade;

ALTER TABLE appointment ADD CONSTRAINT appointment_fk0 FOREIGN KEY (agent_id) REFERENCES agent(agent_id) on delete cascade on update cascade;

ALTER TABLE appointment ADD CONSTRAINT appointment_fk1 FOREIGN KEY (client_id) REFERENCES client(client_id) on delete cascade on update cascade;











