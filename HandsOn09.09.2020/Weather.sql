CREATE TABLE Weather
( City varchar(30),
  State varchar(30),
  High numeric(3),
  Low numeric(3)
  );

INSERT INTO Weather(City,State,High,Low) VALUES('Calcutta','West Bengal',105,90);
INSERT INTO Weather(City,State,High,Low) VALUES('Trivandrum','Kerala',101,92);
INSERT INTO Weather(City,State,High,Low) VALUES('Mumbai','Maharashtra',88,72);
INSERT INTO Weather(City,State,High,Low) VALUES('Bangalore','Karnataka',77,60);
INSERT INTO Weather(City,High,Low) VALUES('New Delhi',80,72);
SELECT * from Weather;
ALTER TABLE Weather ADD NatureOfClimate varchar(15);
UPDATE Weather SET NatureOfClimate = 'sunny' WHERE State = 'West Bengal'; 
DROP TABLE Weather;

