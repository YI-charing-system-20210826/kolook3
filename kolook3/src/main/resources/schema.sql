CREATE TABLE IF NOT EXISTS customer(
customer_id SERIAL NOT NULL ,
last_name VARCHAR(128) NULL,
first_name VARCHAR(128) NULL,
last_name_Kana VARCHAR(128) NULL,
first_name_Kana VARCHAR(128) NULL,
gender CHAR(1) NULL,
birthday DATE NULL,
tel_no int  NULL,
email VARCHAR(100),
post_no int  NULL,
ken_code VARCHAR(4) NULL,
address VARCHAR(128) NULL,
address_detail VARCHAR(128) NULL,
remarks VARCHAR(300),
contract_flg int
,CONSTRAINT abc PRIMARY KEY (customer_id)
);

CREATE TABLE IF NOT EXISTS employee(
member_id SERIAL NOT NULL,
last_name VARCHAR(128) NOT NULL,
first_name VARCHAR(128) NOT NULL,
last_name_Kana VARCHAR(128) NOT NULL,
first_name_Kana VARCHAR(128) NOT NULL,
emp_status VARCHAR(128) NOT NULL,
section VARCHAR(128) NOT NULL,
position VARCHAR(128) NOT NULL,
tel_no int NOT NULL,
email VARCHAR(100),
post_no int NOT NULL,
ken_code VARCHAR(4) NOT NULL,
address VARCHAR(128) NOT NULL,
address_detail VARCHAR(128) NOT NULL,
birthday DATE NOT NULL,
gender CHAR(1) NOT NULL,
join_at int,
leave_at int,
role int,
password VARCHAR(128),
member_img VARCHAR(256),
created_at date,
updated_at date,
last_login date
,PRIMARY KEY (member_id)
);