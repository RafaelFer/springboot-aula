create database listavip;
use listavip;

create table convidado(
id integer auto_increment,
nome varchar(100) not null,
email varchar(100) not null,
telefone varchar(9) not null,
primary key (id));


insert into convidado values(null,'Raimundo Nonato','raimundinho@gmail.com','999999999');
insert into convidado values(null,'Pedro Martinez','pedrinho@gmail.com','888888888');
insert into convidado values(null,'Raul Seixas','raulzinho@gmail.com','777777777');