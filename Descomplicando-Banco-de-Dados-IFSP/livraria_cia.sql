use livraria_cia;



/*
CREATE TABLE clientes (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    email VARCHAR(100),
    telefone VARCHAR(20)
);

CREATE TABLE autores (
    id_autor INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    nacionalidade VARCHAR(50)
);

CREATE TABLE livros (
    id_livro INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(150),
    preco DECIMAL(10,2),
    autor_id INT,
    FOREIGN KEY (autor_id) REFERENCES autores(id_autor)
);

CREATE TABLE pedidos (
    id_pedido INT AUTO_INCREMENT PRIMARY KEY,
    data DATE,
    cliente_id INT,
    FOREIGN KEY (cliente_id) REFERENCES clientes(id_cliente)
);

CREATE TABLE itens_pedido (
    id_item INT AUTO_INCREMENT PRIMARY KEY,
    pedido_id INT,
    livro_id INT,
    quantidade INT,
    FOREIGN KEY (pedido_id) REFERENCES pedidos(id_pedido),
    FOREIGN KEY (livro_id) REFERENCES livros(id_livro)
);

-- altera a tabela pedidos para adicionar coluna valor_total
alter table pedidos add column valor_total decimal(10,2);

insert into autores(nome, nacionalidade)
values('J. K. ROWLING', 'Britânica'), ('George R. R. Martin', 'Americana'),
('Machado de Assis', 'Brasileira');


-- cria a tabela categoria
CREATE TABLE categoria (
    id_categoria INT AUTO_INCREMENT PRIMARY KEY,
    nome_categoria VARCHAR(150)
)

INSERT INTO categoria (nome_categoria) 
VALUES ('Ficção'), ('Fantasia'), ('Drama');


-- cria a tabela fornecedor
CREATE TABLE fornecedor (
    id_fornecedor INT AUTO_INCREMENT PRIMARY KEY,
    nome_fornecedor VARCHAR(100),
    telefone VARCHAR(20)
);

INSERT INTO fornecedor 
(nome_fornecedor, telefone)
VALUES
('Distribuidora Alfa', '1199999-0000'),
('Editora Beta', '1198888-1234');


-- altera a tabela livros para adicionar colunas de id
ALTER TABLE livros
ADD categoria_id INT,
ADD fornecedor_id INT,
ADD FOREIGN KEY (categoria_id) REFERENCES categoria(id_categoria),
ADD FOREIGN KEY (fornecedor_id) REFERENCES fornecedor(id_fornecedor);

INSERT INTO livros (titulo, preco, autor_id, id_categoria, id_fornecedor)
VALUES
('Dom Casmurro', 39.90, 3, 3, 1),
('A Guerra dos Tronos', 59.90, 2, 2, 2),
('Harry Potter e a Pedra Filosofal', 49.90, 1, 2, 1);

-- select com inner join triplo e com com siglas nas tabelas(Table Aliases)
SELECT
	l.id_livro, l.titulo,
	c.id_categoria, c.nome_categoria,
    a.id_autor, a.nome, a.nacionalidade
FROM livros l 
INNER JOIN categoria c ON l.categoria_id = c.id_categoria
INNER JOIN autores a ON l.autor_id = a.id_autor 
WHERE l.categoria_id = 2 
ORDER BY l.id_livro;


*/