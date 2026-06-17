/*
CREATE DATABASE curso_crud; -- Serve para criar um banco de dados

USE curso_crud; -- Seleciona/usa o banco criado


CREATE TABLE projetos ( -- Cria uma tabela e suas colunas (variáveis) para receber os dados
    id INT AUTO_INCREMENT PRIMARY KEY, -- PK: Primary Key (Chave Primária) autoincrementável
    titulo VARCHAR(100),
    descricao TEXT,
    prazo DATE,
    status VARCHAR(30) DEFAULT 'Planejado'
);

CREATE TABLE tarefas ( 
    id INT AUTO_INCREMENT PRIMARY KEY,
    projeto_id INT,
    FOREIGN KEY (projeto_id) REFERENCES projetos(id), -- FK: Vincula a Foreign Key (Chave Estrangeira) da tabela projetos nesta coluna
    descricao TEXT,
    concluida BOOLEAN
); -- Adicionado o ponto e vírgula aqui que faltava


INSERT INTO projetos (titulo, descricao, prazo, status) -- Insere os dados nas colunas (variáveis)
VALUES 
('Design de Interface', 'Criação de layout e protótipos', '2024-07-15', 'Planejado'),
('Testes Iniciais', 'Primeiras validações do sistema', '2024-08-10', 'Planejado');

INSERT INTO tarefas (projeto_id, descricao, concluida) -- Insere dados respeitando as FKs existentes
VALUES 
(1, 'Criar layout inicial', 1),
(1, 'Ajustar responsividade', 0),
(2, 'Implementar login', 1);


SELECT * FROM projetos; -- Consulta a tabela trazendo todas as colunas
SELECT titulo, prazo FROM projetos; -- Consulta trazendo apenas colunas específicas

SELECT * FROM projetos
WHERE status = 'planejado' AND id > 1;  -- Filtra valores específicos. O 'AND' exige que as duas condições sejam verdadeiras.
                                        -- Também existe o 'OR' (basta uma ser verdadeira).

SELECT * FROM projetos
ORDER BY titulo ASC;  -- Ordena as consultas pela coluna especificada. ASC = crescente, DESC = decrescente.

UPDATE projetos             -- Altera registros da tabela.
SET status = 'Revisando'    -- Define o novo valor para a coluna
WHERE id = 1;               -- Filtra a linha específica. CASO NÃO USE 'WHERE', TODAS AS LINHAS SERÃO ALTERADAS!

DELETE FROM tarefas         -- Deleta registros de uma tabela
WHERE id = 2;               -- Filtra a linha específica. CASO NÃO USE 'WHERE', TODOS OS REGISTROS SERÃO APAGADOS!

-- Uso de INNER JOIN para buscar e relacionar dados de duas tabelas diferentes
SELECT p.titulo, t.descricao, p.id, t.projeto_id    
FROM projetos p
INNER JOIN tarefas t ON p.id = t.projeto_id
WHERE t.concluida = 0;

*/