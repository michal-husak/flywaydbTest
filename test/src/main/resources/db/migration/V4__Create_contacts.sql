create table contact
(id int primary key,
id_person int not null,
name varchar(100) not null,
foreign key (id_person) references person(id)
);