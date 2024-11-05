use dbteste;
create table tb_usuario(
 codusu int primary key auto_increment,
 nomeusu varchar(200)not null,
 emailusu varchar(200),
 usuario varchar(200)not null,
 senhausu varchar (200) default "12345",
 admusu bool default false
);

insert into tb_usuario 
(nomeusu, emailusu, usuario,senhausu) values
("adm","adm@adm","adm","adm"),
("Erica Lopes", "profericasilva", "erica","erica123")

select * from tb_usuario;
