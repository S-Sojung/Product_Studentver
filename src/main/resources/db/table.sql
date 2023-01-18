create table student(
    id int auto_increment primary key,
    name varchar not null unique,
    grade int not null,
    email varchar 
);