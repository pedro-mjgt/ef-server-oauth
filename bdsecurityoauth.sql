create table usuario (
	id int primary key auto_increment,
	usuario varchar(100),
	password varchar(200),
	email varchar(100),
	rol varchar(50),
	activo bool
);

insert into usuario (usuario, password, email, rol, activo)
values ('pedro', '$2a$12$sMI58pg3seMEPfZf29uakeX3zNqZ7qa.rbmZovXkXORJgTNCfTMQq', 'pedro@gmail.com', 'admin', true);