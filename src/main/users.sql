CREATE DATABASE IF NOT EXISTS adlister_db;
USE adlister_db;
DROP TABLE IF EXISTS users;
CREATE TABLE IF NOT EXISTS users
(
    id           INT unsigned NOT NULL AUTO_INCREMENT,
    username       VARCHAR(100) NOT NULL,
    email         VARCHAR(100) NOT NULL,
    password         VARCHAR(100) NOT NULL,
    PRIMARY KEY (id)
);