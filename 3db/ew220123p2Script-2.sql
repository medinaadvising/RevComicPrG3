INSERT INTO user_roles (role)
VALUES ('unspecified'),('shopper'),('seller')


SELECT * FROM user_roles

INSERT INTO genres (genre)
VALUES ('unspecified'), ('children'), ('adult'),('romance'),('humor'),('action'),('sifi')

SELECT * FROM genres

INSERT INTO CHARACTERS (charactor)
VALUES ('unspecified'), ('batman'), ('superman'), ('spider man'), ('wonder woman'), ('captain america'), ('iron man')



INSERT INTO users(f_name, L_name,password, user_email, username,role_id)
VALUES ('F1', 'L1', 'pwd1','u1@mail.com','u1name',2),
('F2', 'L2', 'pwd2','u2@mail.com','u2name',2),
('F3', 'L3', 'pwd3','u3@mail.com','u3name',2),
('F4', 'L4', 'pwd4','u4@mail.com','u4name',3)



SELECT * FROM users;


INSERT INTO creators (creator_f_name, creator_l_name, creator_nickname, creator_writer_name)
VALUES ('c1f', 'c1L', 'c1nick', 'c1w'), 
('c2f', 'c2L', 'c2nick', 'c2w'), 
('c3f', 'c3L', 'c3nick', 'c3w')

SELECT * FROM creators

INSERT INTO items (item_description, item_name, num_of_pages, qty_at_seller, title, year_published, character_id, creator_id, genre_id, promo_type_id)
VALUES ('t2desc', 't2name',2,20, 't2title', 2002,2,2,2,2),
('t3desc', 't3name',3,30, 't3title', 2003,3,2,3,2),
('t4desc', 't4name',4,40, 't4title', 2004,4,2,4,2)

SELECT * FROM items; 


INSERT INTO checkouts (desc_checkout, qty_checkout, receipt_num, item_id, pmt_type_id, status_id, users_id)
VALUES ('ch1desc',1, '1',1,1,1, 1),
('ch2desc',2, '2',2,2,2, 2),
('ch3desc',3, '3',1,1,1, 1),
('ch4desc',4, '4',2,2,2, 2)

SELECT * FROM checkouts;