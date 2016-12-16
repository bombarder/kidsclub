DELETE FROM CUSTOMERS;
DELETE FROM FOOD;
DELETE FROM ENTERTAINMENT;

INSERT INTO CUSTOMERS (id, LAST_NAME, FIRST_NAME, LOGIN) VALUES (1, 'petrov', 'Nick', 'edd');
INSERT INTO CUSTOMERS (id, LAST_NAME, FIRST_NAME, LOGIN) VALUES (2, 'orlov', 'Alex', 'stupid');
INSERT INTO CUSTOMERS (id, LAST_NAME, FIRST_NAME, LOGIN) VALUES (3, 'kirylova', 'Valery', 'girl');
INSERT INTO CUSTOMERS (id, LAST_NAME, FIRST_NAME, LOGIN) VALUES (4, 'denisov', 'Vitaly', 'ddd');
INSERT INTO CUSTOMERS (id, LAST_NAME, FIRST_NAME, LOGIN) VALUES (5, 'komarova', 'Inna','ha');
INSERT INTO CUSTOMERS (id, LAST_NAME, FIRST_NAME, LOGIN) VALUES (6, 'shvarts', 'Dmitry','snoop');
INSERT INTO CUSTOMERS (id, LAST_NAME, FIRST_NAME, LOGIN) VALUES (7, 'dorognaya', 'Viktorija', 'fed');

INSERT INTO FOOD (id, DESCRIPTION, NAME, PRICE) VALUES (1, 'cold','icecream', '100');
INSERT INTO FOOD (id, DESCRIPTION, NAME, PRICE) VALUES (2, 'hot','tea', '50');
INSERT INTO FOOD (id, DESCRIPTION, NAME, PRICE) VALUES (3, 'sweet','cookie', '15');
INSERT INTO FOOD (id, DESCRIPTION, NAME, PRICE) VALUES (4, 'sour','lemon', '300');
INSERT INTO FOOD (id, DESCRIPTION, NAME, PRICE) VALUES (5, 'spicy','pepper', '400');

INSERT INTO ENTERTAINMENT (id, DESCRIPTION, NAME, DURATION, PRICE) VALUES (1, 'play','clown', 150, 2000);
INSERT INTO ENTERTAINMENT (id, DESCRIPTION, NAME, DURATION, PRICE) VALUES (2, 'hockey','game', 60, 3000);
INSERT INTO ENTERTAINMENT (id, DESCRIPTION, NAME, DURATION, PRICE) VALUES (3, 'football','game', 70, 4000);
INSERT INTO ENTERTAINMENT (id, DESCRIPTION, NAME, DURATION, PRICE) VALUES (4, 'swimming','play', 80, 3500);
INSERT INTO ENTERTAINMENT (id, DESCRIPTION, NAME, DURATION, PRICE) VALUES (5, 'basketball','trainer', 40, 500);

