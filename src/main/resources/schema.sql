CREATE TABLE country (
  id int NOT NULL,
  iso varchar(2) NOT NULL,
  name varchar(80) NOT NULL,
  nicename varchar(80) NOT NULL,
  iso3 varchar(3) DEFAULT NULL,
  numcode int DEFAULT NULL,
  phonecode int NOT NULL,
  PRIMARY KEY (id)
);