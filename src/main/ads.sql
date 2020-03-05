CREATE DATABASE IF NOT EXISTS adlister_db;
USE adlister_db;
DROP TABLE IF EXISTS ads;
CREATE TABLE IF NOT EXISTS ads
(
    id           INT unsigned NOT NULL AUTO_INCREMENT PRIMARY KEY,
    user_id           INT unsigned NOT NULL,
    title       VARCHAR(100) NOT NULL,
    description         VARCHAR(100) NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users (id)
);