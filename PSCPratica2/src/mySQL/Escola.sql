-- Criação do banco de dados
CREATE DATABASE escola;

-- Seleção do banco de dados
USE escola;

-- Tabela aluno
CREATE TABLE aluno (
    matricula INT PRIMARY KEY,
    CPF VARCHAR(11) UNIQUE,
    nome VARCHAR(100),
    data_nascimento DATE,
    telefone VARCHAR(15),
    endereco VARCHAR(255)
);

-- Tabela curso
CREATE TABLE curso (
    id INT PRIMARY KEY,
    nome VARCHAR(100),
    descricao TEXT,
    valor_mensalidade DECIMAL(10, 2),
    data_criacao DATE
);

-- Tabela unidade_curricular
CREATE TABLE unidade_curricular (
    id INT PRIMARY KEY,
    nome VARCHAR(100),
    descricao TEXT,
    data_inicio DATE,
    data_termino DATE,
    carga_horaria INT
);