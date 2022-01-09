/* ユーザーテーブル */
CREATE TABLE IF NOT EXISTS employee_users_data (
  employee_id INTEGER NOT NULL -- ユーザID
  , username VARCHAR(40) --ユーザーネーム
  , password VARCHAR(255) -- パスワード
  , company_code VARCHAR(5) NOT NULL -- 企業コード
  , company_depart_code VARCHAR(5) -- 稼働先企業コード
  , employee_name VARCHAR(50) NOT NULL -- 名前
  , sex SMALLINT NOT NULL -- 性別
  , birthday DATE NOT NULL -- 生年月日
  , enabled BOOLEAN --謎のtrue
  , age SMALLINT NOT NULL -- 年齢
  , zipcode VARCHAR(8) NOT NULL -- 郵便番号
  , address1 VARCHAR(8) NOT NULL -- 都道府県
  , address2 VARCHAR(32) NOT NULL -- 市区町村
  , address3 VARCHAR(32) NOT NULL -- 町域名
  , block_name VARCHAR(64) NOT NULL -- 丁目以降
  , phonenumber VARCHAR(64) NOT NULL -- 電話番号
  , email VARCHAR(255) NOT NULL -- メールアドレス
  , employee_type SMALLINT NOT NULL -- 雇用形態
  , employee_type_code VARCHAR(3) -- 稼働内容ジャンル
  , Java SMALLINT NOT NULL -- 科目
  , php SMALLINT NOT NULL -- 科目
  , javascript SMALLINT NOT NULL -- 科目
  , mysql SMALLINT NOT NULL -- 科目
  , system_engeneer SMALLINT NOT NULL -- 科目
  , python SMALLINT NOT NULL -- 科目
  , android SMALLINT NOT NULL -- 科目
  , design SMALLINT NOT NULL -- 科目
  , entered_at DATE NOT NULL -- 入社年月日
  , retirement_at DATE -- 退社年月日
  , company_depart_entered_at DATE NOT NULL -- 稼働開始年月日
  , company_depart_retirement_at DATE -- 契約完了予定年月日
  , created_at DATE -- 登録日時
  , updated_at DATE -- 更新日時
  , login_time TIMESTAMP -- ログイン日時
  , time_out_time TIMESTAMP -- タイムアウト日時
  , logout_time TIMESTAMP -- ログアウト日時
  , deleted_at DATE -- 論理削除フラグ
  , memo TEXT -- メモ
  , user_img VARCHAR(255) -- アイコン
  , exist SMALLINT -- emailユニーク解除フラグ
  , email_flg SMALLINT -- メール配信フラグ
  , PRIMARY KEY (employee_id)
);

/* 言語テーブル */
CREATE TABLE IF NOT EXISTS employee_language_data (
    language_code VARCHAR(5) NOT NULL -- 言語コード
  , language VARCHAR(64) NOT NULL -- 言語
  , created_at TIMESTAMP NOT NULL -- 登録日時
  , updated_at TIMESTAMP NOT NULL -- 更新日時
);
/* 商品テーブル */
CREATE TABLE IF NOT EXISTS employee_companies_data (
    company_code VARCHAR(5) NOT NULL -- 企業コード
  , company_name VARCHAR(64) NOT NULL -- 企業名
  , created_at DATE -- 登録日時
  , updated_at DATE -- 更新日時
);
/* 売上テーブル */
CREATE TABLE IF NOT EXISTS employee_companies_depart_data (
    company_depart_code VARCHAR(5) NOT NULL -- 稼働先企業コード
  , company_depart_name VARCHAR(64) NOT NULL -- 稼働先企業名
  , created_at DATE -- 登録日時
  , updated_at DATE -- 更新日時
);
/* 売上テーブル */
CREATE TABLE IF NOT EXISTS employee_type_code (
    employee_type_code VARCHAR(3) NOT NULL -- 稼働先企業コード
  , employee_name VARCHAR(16) NOT NULL -- 稼働先企業名
);
