CREATE TABLE empresa(
  id SERIAL PRIMARY KEY,
	cnpj CHAR(18) NOT NULL,
	nome VARCHAR(100) NOT NULL,
	endereco VARCHAR(100) NOT NULL, 
	email VARCHAR(200) NOT NULL
);