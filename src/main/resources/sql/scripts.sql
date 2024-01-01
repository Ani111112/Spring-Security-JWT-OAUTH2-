create database eazybank;
use eazybank;
create table users(
	id INT NOT NULL auto_increment,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
    ENABLED INT NOT NULL,
    primary key(id)
);

create table authorities(
	id INT NOT NULL auto_increment,
    username VARCHAR(50) NOT NULL,
    authority VARCHAR(50) NOT NULL,
    primary key(id)
);

INSERT ignore INTO users values (null, 'happy', '12345', '1');
INSERT ignore INTO authorities values (null, 'happy', 'write');