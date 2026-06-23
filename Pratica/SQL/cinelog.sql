CREATE DATABASE cinelog;

CREATE TABLE pais (
	id INT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(80)
);

CREATE TABLE usuario (
	id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(80),
	pais_id INT,
    FOREIGN KEY(pais_id) REFERENCES pais(id)
);

CREATE TABLE diretor (
	id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(80),
    data_nascimento DATE,
    pais_id INT,
    FOREIGN KEY(pais_id) REFERENCES pais(id)
    );

CREATE TABLE ator (
	id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(80),
    data_nascimento DATE,
    pais_id INT,
    FOREIGN KEY(pais_id) REFERENCES pais(id)
);

CREATE TABLE estudio (
	id INT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(80),
    data_fundacao DATE,
    ativo BOOLEAN,
    pais_id INT,
    FOREIGN KEY(pais_id) REFERENCES pais(id)
);

CREATE TABLE genero (
	id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(30)
);

CREATE TABLE filme (
	id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(200),
    sinopse VARCHAR(400),
    data_lancamento DATE,
    pais_id INT,
	diretor_id INT,
    estudio_id INT,
	FOREIGN KEY(pais_id) REFERENCES pais(id),
    FOREIGN KEY(diretor_id) REFERENCES diretor(id),
    FOREIGN KEY(estudio_id) REFERENCES estudio(id)
);

CREATE TABLE elenco (
	id INT PRIMARY KEY AUTO_INCREMENT,
    papel VARCHAR(80),
    ator_id INT,
    filme_id INT,
    FOREIGN KEY(ator_id) REFERENCES ator(id),
    FOREIGN KEY(filme_id) REFERENCES filme(id)
);

CREATE TABLE filme_genero (
	filme_id INT,
    genero_id INT,
	FOREIGN KEY(filme_id) REFERENCES filme(id),
    FOREIGN KEY(genero_id) REFERENCES genero(id),
    PRIMARY KEY (filme_id, genero_id)
);

CREATE TABLE review (
	id INT PRIMARY KEY AUTO_INCREMENT,
	assistido BOOLEAN,
    nota INT,
    relato VARCHAR(800),
    usuario_id INT,
    filme_id INT,
    FOREIGN KEY(usuario_id) REFERENCES usuario(id),
    FOREIGN KEY(filme_id) REFERENCES filme(id)
);