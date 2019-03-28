create table member
(
  id         binary(255) not null,
  email      varchar(255),
  first_name varchar(255),
  last_name  varchar(255),
  password   varchar(255),
  primary key (id)
) engine = InnoDB