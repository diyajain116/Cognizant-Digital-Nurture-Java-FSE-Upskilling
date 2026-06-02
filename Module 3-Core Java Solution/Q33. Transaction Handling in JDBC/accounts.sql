CREATE DATABASE bankdb;

USE bankdb;

CREATE TABLE accounts (
    account_id INT PRIMARY KEY,
    name VARCHAR(50),
    balance DOUBLE
);

INSERT INTO accounts VALUES
(1,'Diya',10000),
(2,'Rahul',5000);