drop table if exists tbl_member;

create table tbl_member(
email varchar(100) not null primary key,
nickname varchar(100) not null,
password varchar(50) not null,
grade tinyint(2) default 0
)ENGINE=InnoDB default charset=utf8;