create database devsuperior;
use devsuperior;

create table tb_order (
    id integer auto_increment primary key, 
    latitude float, 
    longitude float, 
    moment TIMESTAMP, 
    status int
);

create table tb_order_product (
    order_id int not null, 
    product_id int not null, 
    primary key (order_id, product_id)
);

create table tb_product (
    id integer auto_increment primary key, 
    description TEXT, 
    image_uri varchar(255), 
    name varchar(255), 
    price float
);

alter table tb_order_product 
add constraint fk_tb_order_product_tb_product 
foreign key (product_id) references tb_product (id);

alter table tb_order_product 
add constraint fk_tb_order_product_tb_order 
foreign key (order_id) references tb_order;

INSERT INTO tb_product (name, price, image_Uri, description) VALUES 
('Pizza de Calabresa', 50.0, 'https://github.com/devsuperior/1.png', 'Pizza calabresa com queijo, molho e massa especial'),
('Pizza Quatro Queijos', 40.0, 'https://github.com/devsuperior/2.png', 'Pizza quatro queijos muito boa'),
('Pizza de Escarola', 60.0, 'https://github.com/devsuperior/3.png', 'Pizza escarola muito boa');

INSERT INTO tb_order (status, latitude, longitude, moment) VALUES (0, 213123, 12323, now());
INSERT INTO tb_order (status, latitude, longitude, moment) VALUES(1, 3453453, 3534534, now());

INSERT INTO tb_order_product (order_id, product_id) VALUES 
(1 , 1),
(1 , 2),
(2 , 2),
(2 , 3);


