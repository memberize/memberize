create database memberize;

create user 'memberize'@'%' identified by 'memberizepw';

grant all on memberize.* to 'memberize'@'%';

flush privileges;

