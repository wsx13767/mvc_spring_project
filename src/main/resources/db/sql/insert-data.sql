INSERT INTO users (name, email, framework) VALUES ('mkyong', 'mkyong@gmail.com', 'Spring MVC, GWT');
INSERT INTO users (name, email, framework) VALUES ('alex', 'alex@yahoo.com', 'Spring MVC, PLAY');
INSERT INTO users (name, email, framework) VALUES ('joel', 'joel@gmail.com', 'Spring MVC, JSF 2');
INSERT INTO users (name, password, email, framework) VALUES ('siang', '1qaz@WSX', 'mkyong@gmail.com', 'Spring MVC, JSF 2');



--使用者資料
INSERT INTO users2 (account, password, email, sex, name) VALUES ('admin', 'admin', 'mkyong@gmail.com', 'man', 'Tony');
INSERT INTO users2 (account, password, email, sex, name) VALUES ('admin2', 'admin2', 'mkyong@gmail.com', 'man', 'Tony');
INSERT INTO users2 (account, password, email, sex, name) VALUES ('admin3', 'admin3', 'mkyong@gmail.com', 'man', 'Tony');

--商品資料
INSERT INTO products (product_name, product_kinds, product_info, image) VALUES ('紅茶', 'DRINK', 'TEST', 'redTea.jpg');
INSERT INTO products (product_name, product_kinds, product_info, image) VALUES ('綠茶', 'DRINK', 'TEST', 'greenTea.jpg');
INSERT INTO products (product_name, product_kinds, product_info, image) VALUES ('麥茶', 'DRINK', 'TEST', 'wheatTea.jpg');
INSERT INTO products (product_name, product_kinds, product_info, image) VALUES ('奶茶', 'DRINK', 'TEST', 'milkTea.jpg');
INSERT INTO products (product_name, product_kinds, product_info, image) VALUES ('多多綠', 'DRINK', 'TEST', 'yakultGreenTea.jpg');
--訂單
INSERT INTO order_info (product_id, product_money, product_max_number, state) VALUES ('1', '20', '50', 'normal');
INSERT INTO order_info (product_id, product_money, product_max_number, state) VALUES ('4', '25', '60', 'normal');
INSERT INTO order_info (product_id, product_money, product_max_number, state) VALUES ('3', '30', '70', 'normal');
INSERT INTO order_info (product_id, product_money, product_max_number, state) VALUES ('2', '35', '80', 'normal');
INSERT INTO order_info (product_id, product_money, product_max_number, state) VALUES ('3', '35', '80', 'normal');
INSERT INTO order_info (product_id, product_money, product_max_number, state) VALUES ('2', '35', '80', 'normal');

--訂單資訊
INSERT INTO join_info (account, order_id, product_number) VALUES ('admin', '1', '2');
INSERT INTO join_info (account, order_id, product_number) VALUES ('admin2', '1', '2');