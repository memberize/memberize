create table member
(
  id         bigint              not null auto_increment,
  email      varchar(255) unique not null,
  first_name varchar(255)        not null,
  last_name  varchar(255)        not null,
  password   varchar(255)        not null,
  primary key (id)
) engine = MyISAM