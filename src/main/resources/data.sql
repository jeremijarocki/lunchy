-- wszyscy mają to samo hasło - abc123

INSERT INTO USERS (login, password)
VALUES ('tester', 'e99a18c428cb38d5f260853678922e03');

INSERT INTO USERS (login, password)
VALUES ('Jeremi', 'e99a18c428cb38d5f260853678922e03');

INSERT INTO USERS (login, password)
VALUES ('Maćko', 'e99a18c428cb38d5f260853678922e03');

INSERT INTO USERS (login, password)
VALUES ('Kamil', 'e99a18c428cb38d5f260853678922e03');

--adding caterers

INSERT INTO CATERERS (NAME, ADDRESS, CUISINE, TELEPHONE, EMAIL)
VALUES ('PIZZA HUT', 'NIEPODLEGLOŚCI 135, WARSZAWA 04-570', 'ITALIAN', '2232353546', 'NIEPODLEGLOSCI@PIZZAHUT.PL');

INSERT INTO CATERERS (NAME, ADDRESS, CUISINE, TELEPHONE, EMAIL)
VALUES ('U BABUNI', 'RACŁAWICKA 15, WARSZAWA 02-570', 'POLISH', '2232656446', 'UBABUNI@O2.PL');

INSERT INTO CATERERS (NAME, ADDRESS, CUISINE, TELEPHONE, EMAIL)
VALUES ( 'KEBAB KING', 'BATOREGO 12, WARSZAWA 02-572', 'TURKISH', '22354567974', 'BATOREGO12@KEBABKING.PL' );

INSERT INTO CATERERS (NAME, ADDRESS, CUISINE, TELEPHONE, EMAIL)
VALUES ( 'BIESIADOWO', 'PIĘKNA 12, WARSZAWA 06-432', 'ITALIAN', '22887656455', 'PIEKNA12@BIESIADOWO.PL' );

INSERT INTO CATERERS (NAME, ADDRESS, CUISINE, TELEPHONE, EMAIL)
VALUES ( 'KFC', 'PLAC KONSTYTUCJI 1, WARSZAWA 04-523', 'AMERICAN', '22365688765', 'PL.KONSTY@KFC.PL');

INSERT INTO CATERERS (NAME, ADDRESS, CUISINE, TELEPHONE, EMAIL)
VALUES ( 'MCDONALDS', 'MARSZAŁKOWSKA 53, WARSZAWA 06-346', 'AMERICAN', '226569456', 'MARSZAL53@MCDONALDS.PL');

INSERT INTO CATERERS (NAME, ADDRESS, CUISINE, TELEPHONE, EMAIL)
VALUES ( 'DOMOWE OBIADY', 'J.CURIE 1, WARSZAWA 04-543', 'POLISH', '226590690', 'DOMOWE_OBIADY@GMAIL.COM');

INSERT INTO CATERERS (NAME, ADDRESS, CUISINE, TELEPHONE, EMAIL)
VALUES ( 'AMRIT KEBAB', 'WILEŃSKA 23, WARSZAWA 03-596', 'TURKISH', '2206596094', 'AMRIT-WILENSKA@KEBAB.PL' );

INSERT INTO CATERERS (NAME, ADDRESS, CUISINE, TELEPHONE, EMAIL)
VALUES ( 'INDIA EXPRESS', 'E.PLATER 98, WARSZAWA 01-234', 'INDIAN', '2206540943', 'ZAMOWIENIA@INDIAEXPRESS.PL' );

INSERT INTO CATERERS (NAME, ADDRESS, CUISINE, TELEPHONE, EMAIL)
VALUES ( 'PAD THAI', 'AL.JEROZOLIMSKIE 123, WARSZAWA 00-302', 'THAI', '2290450945', 'ORDERS@PADTHAI.PL' );

INSERT INTO CATERERS (NAME, ADDRESS, CUISINE, TELEPHONE, EMAIL)
VALUES ( 'SAI GON', 'OBOZOWA 2, WARSZAWA 00-593', 'ASIAN', '22043509345', 'SAIGONWARSAW@GMAIL.COM' );

INSERT INTO CATERERS (NAME, ADDRESS, CUISINE, TELEPHONE, EMAIL)
VALUES ( 'SUSHI WOLA', 'WOLSKA 2, WARSZAWA 04-235', 'JAPANESE', '60350435034', 'ZAMOWIENIA@SUSHIWOLA.PL' );

--adding dishes

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
values ( 'PEPERONI', 24.99, 'MEAT', 1 );

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
values ( 'CARBONARA', 27.99, 'MEAT', 1 );

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
values ( 'FUNGHI', 21.99, 'MEAT', 1 );

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
values ( 'CALZONE', 22.99, 'MEAT', 1 );

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
values ( 'HAWAIAN', 23.99, 'MEAT', 1 );

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
values ( 'BARBECUE', 26.99, 'MEAT', 1 );

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
values ( 'FRUTTI DI MARE', 29.99, 'MEAT', 1 );

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
values ( 'RUSTICA', 21.99, 'VEGETARIAN', 1 );

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
values ( 'MAFIA', 27.99, 'MEAT', 1 );


INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
VALUES ('SCHABOWY Z ZIEMNIAKAMI I SURÓWKĄ', 13.99, 'MEAT', 2);

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
VALUES ('PIEROGI RUSKIE', 8.99, 'VEGETARIAN', 2);

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
VALUES ('KOTLET DE VOLAIE Z ZIEMNIAKAMI I SURÓWKĄ', 15.99, 'MEAT', 2);

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
VALUES ('BIGOS Z KIEŁBASĄ', 9.99, 'MEAT', 2);

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
VALUES ('KOTLET MIELONY W SOSIE POMIDOROWYM Z ZIEMNIAKAMI I SURÓWKĄ', 11.99, 'MEAT', 2);

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
VALUES ('BITKI WOŁOWE Z FRYTKAMI', 17.99, 'MEAT', 2);

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
VALUES ('PLACEK PO WĘGIERSKU', 10.99, 'MEAT', 2);

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
VALUES ('PIEROGI Z KAPUSTĄ I GRZYBAMI', 7.99, 'VEGETARIAN', 2);


INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
VALUES ('KEBAB Z KURCZAKIEM W CIENKIM CIEŚCIE', 10.99, 'MEAT', 3);

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
VALUES ('KEBAB Z KURCZAKIEM W GRUBYM CIEŚCIE', 11.99, 'MEAT', 3);

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
VALUES ('FALAFEL', 8.99, 'VEGETARIAN', 3);

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
VALUES ('SHOARMA', 17.99, 'MEAT', 3);

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
VALUES ('KEBAB Z BARANINĄ W CIENKIM CIEŚCIE', 11.99, 'MEAT', 3);

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
VALUES ('KEBAB Z BARANINĄ W GRUBYM CIEŚCIE', 12.99, 'MEAT', 3);

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
VALUES ('PIECZONE BAKŁAŻANY Z FRYTKAMI', 8.99, 'VEGAN', 3);


INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
values ( 'PEPERONI', 20.99, 'MEAT', 4 );

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
values ( 'CARBONARA', 23.99, 'MEAT', 4 );

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
values ( 'FUNGHI', 17.99, 'MEAT', 4 );

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
values ( 'CALZONE', 18.99, 'MEAT', 4 );

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
values ( 'HAWAIAN', 20.99, 'MEAT', 4 );

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
values ( 'BARBECUE', 24.99, 'MEAT', 4 );

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
values ( 'FRUTTI DI MARE', 25.99, 'MEAT', 4 );

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
values ( 'RUSTICA', 17.99, 'VEGETARIAN', 4 );

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
values ( 'MAFIA', 22.99, 'MEAT', 4 );


INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
values ( 'MEGA POCKET', 12.99, 'MEAT', 5 );

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
values ( 'TWISTER', 10.99, 'MEAT', 5 );

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
values ( 'ZINGER', 11.99, 'MEAT', 5 );

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
values ( 'KUBEŁEK CLASSIC', 22.99, 'MEAT', 5 );

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
values ( 'GRANDER', 14.99, 'MEAT', 5 );


INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
values ( 'HAMBURGER', 4.99, 'MEAT', 6 );

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
values ( 'CHEESBURGER', 4.99, 'MEAT', 6 );

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
values ( 'BIGMAC', 12.99, 'MEAT', 6 );

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
values ( 'MCROYAL', 12.99, 'MEAT', 6 );

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
values ( 'MCFISH', 11.99, 'MEAT', 6 );

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
values ( 'MCDOUBLE', 5.99, 'MEAT', 6 );


INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
VALUES ('SCHABOWY Z ZIEMNIAKAMI I SURÓWKĄ', 13.99, 'MEAT', 7);

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
VALUES ('PIEROGI RUSKIE', 8.99, 'VEGETARIAN', 7);

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
VALUES ('KOTLET DE VOLAIE Z ZIEMNIAKAMI I SURÓWKĄ', 15.99, 'MEAT', 7);

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
VALUES ('BIGOS Z KIEŁBASĄ', 9.99, 'MEAT', 7);

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
VALUES ('KOTLET MIELONY W SOSIE POMIDOROWYM Z ZIEMNIAKAMI I SURÓWKĄ', 11.99, 'MEAT', 7);

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
VALUES ('BITKI WOŁOWE Z FRYTKAMI', 17.99, 'MEAT', 7);

INSERT INTO DISHES (NAME, PRICE, DISH_TYPE, CATERERS_ID)
VALUES ('PLACEK PO WĘGIERSKU', 10.99, 'MEAT', 7);

--adding transactions

INSERT INTO TRANSACTIONS (CATERERs_ID, TRANSACTION_STATUS, TRANSACTION_DATE)
VALUES (1, 'IN_PREPARATION', '2019-03-20');

INSERT INTO TRANSACTIONS (CATERERs_ID, TRANSACTION_STATUS, TRANSACTION_DATE)
VALUES (2, 'IN_PREPARATION', '2019-03-20');

INSERT INTO TRANSACTIONS (CATERERs_ID, TRANSACTION_STATUS, TRANSACTION_DATE)
VALUES (3, 'ARCHIVED', '2019-03-11');

INSERT INTO TRANSACTIONS (CATERERs_ID, TRANSACTION_STATUS, TRANSACTION_DATE)
VALUES (4, 'DELIVERED', '2019-03-19');

INSERT INTO TRANSACTIONS (CATERERs_ID, TRANSACTION_STATUS, TRANSACTION_DATE)
VALUES (5, 'SENT', '2019-03-20');

INSERT INTO TRANSACTIONS (CATERERs_ID, TRANSACTION_STATUS, TRANSACTION_DATE)
VALUES (6, 'CLOSED', '2019-03-21');

INSERT INTO TRANSACTIONS (CATERERs_ID, TRANSACTION_STATUS, TRANSACTION_DATE)
VALUES (7, 'IN_PREPARATION', '2019-03-21');

--adding orders

INSERT INTO orders(users_id, order_date, CATERERs_ID, transactions_id)
VALUES (1, '2019-03-20', 1, 1);

INSERT INTO orders(users_id, order_date, CATERERs_ID, transactions_id)
VALUES (2, '2019-03-20', 1, 1);

INSERT INTO orders(users_id, order_date, CATERERs_ID, transactions_id)
VALUES (3, '2019-03-20', 1, 1);

INSERT INTO orders(users_id, order_date, CATERERs_ID, transactions_id)
VALUES (2, '2019-03-20', 2, 2);

INSERT INTO orders(users_id, order_date, CATERERs_ID, transactions_id)
VALUES (3, '2019-03-20', 2, 2);

INSERT INTO orders(users_id, order_date, CATERERs_ID, transactions_id)
VALUES (4, '2019-03-20', 9, 7);

--adding order_items

INSERT INTO order_items (dishes_id, orders_id)
values (1, 1);

INSERT INTO order_items (dishes_id, orders_id)
values (2, 1);

INSERT INTO order_items (dishes_id, orders_id)
values (3, 1);

INSERT INTO order_items (dishes_id, orders_id)
values (4, 2);

INSERT INTO order_items (dishes_id, orders_id)
values (5, 2);

INSERT INTO order_items (dishes_id, orders_id)
values (6, 2);

INSERT INTO order_items (dishes_id, orders_id)
values (7, 3);

INSERT INTO order_items (dishes_id, orders_id)
values (8, 3);

INSERT INTO order_items (dishes_id, orders_id)
values (9, 4);

INSERT INTO order_items (dishes_id, orders_id)
values (10, 4);

INSERT INTO order_items (dishes_id, orders_id)
values (11, 5);

--adding transaction_items

INSERT INTO TRANSACTION_ITEMS (ORDERS_ID, TRANSACTIONS_ID)
VALUES (1, 1);

INSERT INTO TRANSACTION_ITEMS (ORDERS_ID, TRANSACTIONS_ID)
VALUES (2, 1);

INSERT INTO TRANSACTION_ITEMS (ORDERS_ID, TRANSACTIONS_ID)
VALUES (3, 1);

INSERT INTO TRANSACTION_ITEMS (ORDERS_ID, TRANSACTIONS_ID)
VALUES (4, 2);

INSERT INTO TRANSACTION_ITEMS (ORDERS_ID, TRANSACTIONS_ID)
VALUES (5, 3);