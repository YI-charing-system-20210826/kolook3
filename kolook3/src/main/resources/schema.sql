CREATE TABLE IF NOT EXISTS customer(
customer_id int NOT NULL ,
last_name VARCHAR(128) NOT NULL,
first_name VARCHAR(128) NOT NULL,
last_name_Kana VARCHAR(128) NOT NULL,
first_name_Kana VARCHAR(128) NOT NULL,
gender CHAR(1) NOT NULL,
birthday DATE NOT NULL,
tel_no int NOT NULL,
email VARCHAR(100),
post_no int NOT NULL,
ken_code VARCHAR(4) NOT NULL,
address VARCHAR(128) NOT NULL,
address_detail VARCHAR(128) NOT NULL,
remarks VARCHAR(300),
contract_flg int
--,PRIMARY KEY (customer_id)
);

--CREATE TABLE IF NOT EXISTS employee(
--employee_id int NOT NULL ,
--last_name VARCHAR(128) NOT NULL,
--first_name VARCHAR(128) NOT NULL,
--last_name_Kana VARCHAR(128) NOT NULL,
--first_name_Kana VARCHAR(128) NOT NULL,
--emp_status VARCHAR(128) NOT NULL,
--position VARCHAR(128) NOT NULL,
--tel_no int NOT NULL,
--email VARCHAR(100),
--post_no int NOT NULL,
--ken_code VARCHAR(4) NOT NULL,
--address VARCHAR(128) NOT NULL,
--address_detail VARCHAR(128) NOT NULL,
--birthday DATE NOT NULL,
--gender CHAR(1) NOT NULL,
--join_at int,
--leave_at int,
--role int,
--password VARCHAR(128),
--member_img VARCHAR(256),
--created_at date,
--updated_at date,
--last_login date
--,PRIMARY KEY (employee_id)
--);
