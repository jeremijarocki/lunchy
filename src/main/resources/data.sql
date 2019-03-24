-- login tester, haslo abc123 (zahashowane)

INSERT INTO USERS (login, password)

VALUES ('tester', 'e99a18c428cb38d5f260853678922e03');

INSERT INTO USERS (login, password)

VALUES ('Jeremi', 'e99a18c428cb38d5f260853678922e03');

--adding caterers

INSERT INTO CATERERS (NAME, ADDRESS, CUISINE, TELEPHONE, EMAIL)

VALUES ('PIZZA HUT', 'NIEPODLEGLOŚCI 135, WARSZAWA 04-570', 'ITALIAN', '2232353546', 'NIEPODLEGLOSCI@PIZZAHUT.PL');

INSERT INTO CATERERS (NAME, ADDRESS, CUISINE, TELEPHONE, EMAIL)

VALUES ('U BABUNI', 'RACŁAWICKA 15, WARSZAWA 02-570', 'POLISH', '2232656446', 'UBABUNI@O2.PL');

--adding dishes

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)

VALUES ('TIKKA MASALA', 19.99, 'MEAT', 1);

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)

VALUES ('SCHABOWY Z ZIEMNIAKAMI I SURÓWKĄ', 13.99, 'MEAT', 2);

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)

VALUES ('WĘDZONE TOFU Z MAKARONEM RYŻOWYM', 11.99, 'VEGAN', 1);

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)

VALUES ('HUMMUS Z BAKŁAŻANEM', 10.99, 'VEGETARIAN', 2);

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)

VALUES ('RYŻ SMAŻONY Z KURCZAKIEM', 12.99, 'MEAT', 1);

--adding order

INSERT INTO orders(users_id, order_date, CATERERs_ID)

VALUES (1, '2019-03-16', 1);

INSERT INTO orders(users_id, order_date, CATERERs_ID)

VALUES (1, '2019-03-17', 2);

INSERT INTO orders(users_id, order_date, CATERERs_ID)

VALUES (1, '2019-03-18', 1);

--adding order_items

INSERT INTO order_items (dishes_id, orders_id)

values (1, 1);

INSERT INTO order_items (dishes_id, orders_id)

values (2, 1);

INSERT INTO order_items (dishes_id, orders_id)

values (3, 2);

INSERT INTO order_items (dishes_id, orders_id)

values (4, 3);

INSERT INTO order_items (dishes_id, orders_id)

values (5, 2);

--adding transactions

INSERT INTO TRANSACTIONS (CATERERs_ID, TRANSACTION_STATUS, TRANSACTION_DATE)
VALUES ( 1, 'IN_PREPARATION', '2019-03-20' );

INSERT INTO TRANSACTIONS (CATERERs_ID, TRANSACTION_STATUS, TRANSACTION_DATE)
VALUES ( 2, 'IN_PREPARATION', '2019-03-20' );

--adding transaction items

INSERT INTO TRANSACTION_ITEMS (ORDERS_ID, TRANSACTIONs_ID)
VALUES ( 1,1 );

INSERT INTO TRANSACTION_ITEMS (ORDERS_ID, TRANSACTIONs_ID)
VALUES ( 2,1 );

INSERT INTO TRANSACTION_ITEMS (ORDERS_ID, TRANSACTIONs_ID)
VALUES ( 3,2 );