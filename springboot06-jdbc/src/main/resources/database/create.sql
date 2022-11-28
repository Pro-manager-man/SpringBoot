create database springboot charset utf8;
use springboot;

create table t_user(
    id int primary key auto_increment,
    username varchar(200) not null unique,
    password varchar(200)
)engine=InnoDB charset utf8;

insert into t_user values (null,'admin','123');
insert into t_user values (null,'tom','456');