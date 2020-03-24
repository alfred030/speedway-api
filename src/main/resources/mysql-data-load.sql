DROP DATABASE speedway_api;
CREATE DATABASE speedway_api;
Use speedway_api;
DROP TABLE IF EXISTS cars;
CREATE TABLE cars
(
    id    INTEGER AUTO_INCREMENT,
    nick_name VARCHAR(20),
    model     VARCHAR(50),
    year    VARCHAR(20),
    status     VARCHAR(200),
    topSpeed        VARCHAR(50),
    PRIMARY KEY (id)
);
select *
from cars;
