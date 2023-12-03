-- Criando as tabelas:
-- Tabela 'usuarios'
CREATE TABLE usuarios (
    id INT PRIMARY KEY,
    nome VARCHAR(100),
    email VARCHAR(255)
);

-- Tabela 'detalhes_usuarios'
CREATE TABLE detalhes_usuarios (
    usuario_id INT PRIMARY KEY,
    endereco VARCHAR(255),
    telefone VARCHAR(20),
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id)
);
-- Inserindo registros nas tabelas:
-- Inserindo um usuário
INSERT INTO usuarios (id, nome, email) VALUES (1, 'João', 'joao@example.com');

-- Inserindo detalhes do usuário
INSERT INTO detalhes_usuarios (usuario_id, endereco, telefone) VALUES (1, 'Rua A, 123', '(11) 98765-4321');

--Consultando os dados com relacionamento:
-- Consulta com JOIN
SELECT usuarios.id, usuarios.nome, usuarios.email, detalhes_usuarios.endereco, detalhes_usuarios.telefone
FROM usuarios
JOIN detalhes_usuarios ON usuarios.id = detalhes_usuarios.usuario_id;
