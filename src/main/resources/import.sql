INSERT INTO tb_category(id,name) VALUES (1,'Livros');
INSERT INTO tb_category(id,name) VALUES (2,'Computadores');
INSERT INTO tb_category(id,name) VALUES (3,'Eletrônicos');

INSERT INTO tb_product(name,description,price,img_url) VALUES ('Kindle','Kindle',100,'https://www.amazon.com/Kindle-Fire-8th-Generation-Wi-Fi/dp/B007NF0S2M/ref=sr_1_1?dchild=1&keywords=kindle+fire&qid=1646981287&sr=8-1');
INSERT INTO tb_product(name,description,price,img_url) VALUES ('Notebook','Notebook',100,'https://www.amazon.com/Kindle-Fire-8th-Generation-Wi-Fi/dp/B007NF0S2M/ref=sr_1_1?dchild=1&keywords=kindle+fire&qid=1646981287&sr=8-1');

INSERT INTO tb_product_category(product_id,category_id) VALUES (1,1);
INSERT INTO tb_product_category(product_id,category_id) VALUES (1,2);

INSERT INTO `tb_user` (name, email, password, phone, birth_date, roles)VALUES ('João Silva', 'joao@email.com', 'senha123', '11999999999', '1990-05-20', 'USER');
INSERT INTO `tb_user` (name, email, password, phone, birth_date, roles)VALUES ('Maria Silva', 'maria@email.com', 'senha123', '11999999999', '1990-05-20', 'ADMIN');

INSERT INTO tb_order(moment,status,user_id) VALUES (now(),0,1);

INSERT INTO tb_order_item(order_id,product_id,quantity,price) VALUES (1,1,1,100);
INSERT INTO tb_order_item(order_id,product_id,quantity,price) VALUES (1,2,1,100);



-- INSERT INTO tb_order_item(order_id,product_id,quantity,price) VALUES (1,1,1,100);
