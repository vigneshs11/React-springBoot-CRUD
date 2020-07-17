	DROP TABLE IF EXISTS product;
 
CREATE TABLE product (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  description VARCHAR(250) NOT NULL,
  homedelivery VARCHAR(250) DEFAULT NULL
);
 
INSERT INTO product (name, description, homedelivery) VALUES
  ('TV', 'sony hd', 'yes'),
  ('Fridge', 'new v3', 'yes'),
  ('Radio', 'wireless', 'no');