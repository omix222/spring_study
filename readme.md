## Springサンプルアプリ

### PostgreSQLインストール後、以下作成

- createdb -O posuser testdb;
- psql testdb
	- alter role posuser with password 'postgres';

### テーブルのDDL（psqlのターミナル内で動作確認したもの）

- CREATE table T_EMPLOYEE(ID varchar(30) primary key, NAME varchar(30), DEPARTMENT_NAME varchar(30));

- INSERT INTO T_EMPLOYEE(ID, NAME, DEPARTMENT_NAME) VALUES('id001','TAKAHA ROMI','ITP');

- INSERT INTO T_EMPLOYEE(ID, NAME, DEPARTMENT_NAME) VALUES('id002','SEKI YU','JFW');

- GRANT ALL ON T_EMPLOYEE TO posuser;