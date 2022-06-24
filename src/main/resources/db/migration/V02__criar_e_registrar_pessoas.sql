
create table pessoa
(
  codigo BIGINT primary key AUTO_INCREMENT not null,
  nome varchar(50) not null,
  logradouro varchar(30),
  numero varchar(10),
  complemento varchar(30),      
  bairro varchar(30),
  cep varchar(10),
  cidade varchar(30),
  estado varchar(30),
  ativo boolean
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into pessoa values(null,'Rafael','Rua Carijo','31','Universidade da Crianca','Sao Roque','26132-250','Queimados','RJ',true);
insert into pessoa values(null,'Roumenique','Rua Sertao','154','','Da Serra','126548-526','Taboao','SP',false);
insert into pessoa values(null,'Adevando','Rua Taioba','11','','Gerome','444528-152','Ruao','MG',false);
insert into pessoa values(null,'Jeroquina','Rua Jattada','85','','Leos','854632-251','Love','RN',true);
