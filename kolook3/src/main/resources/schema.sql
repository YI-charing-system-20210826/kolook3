CREATE TABLE IF NOT EXISTS customer(
customer_id SERIAL NOT NULL ,
last_name VARCHAR(128) NULL,
first_name VARCHAR(128) NULL,
last_name_Kana VARCHAR(128) NULL,
first_name_Kana VARCHAR(128) NULL,
gender CHAR(1) NULL,
birthday VARCHAR(128) NULL,
tel_no VARCHAR(128)  NULL,
email VARCHAR(100),
post_no VARCHAR(100) NULL,
ken_code VARCHAR(4) NULL,
address VARCHAR(128) NULL,
address_detail VARCHAR(128) NULL,
remarks VARCHAR(300),
contract_flg int NULL
,CONSTRAINT abc PRIMARY KEY (customer_id)
);

CREATE TABLE IF NOT EXISTS employee(
member_id SERIAL NOT NULL,
last_name VARCHAR(128) NULL,
first_name VARCHAR(128) NULL,
last_name_Kana VARCHAR(128) NULL,
first_name_Kana VARCHAR(128) NULL,
emp_status VARCHAR(128) NULL,
section VARCHAR(128) NULL,
position VARCHAR(128) NULL,
tel_no VARCHAR(128) NULL,
email VARCHAR(100),
post_no VARCHAR(100) NULL,
ken_code VARCHAR(4) NULL,
address VARCHAR(128) NULL,
address_detail VARCHAR(128) NULL,
birthday VARCHAR(128)  NULL,
gender CHAR(1)  NULL,
join_at int,
leave_at int,
role int,
password VARCHAR(128),
member_img VARCHAR(256),
created_at date,
updated_at date,
last_login date
,CONSTRAINT def PRIMARY KEY (member_id)
);