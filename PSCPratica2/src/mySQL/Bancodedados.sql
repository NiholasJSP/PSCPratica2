-- Criação do banco de dados
CREATE DATABASE corretora;

-- Seleção do banco de dados
USE corretora;

-- Tabela cliente
CREATE TABLE cliente (
    CPF VARCHAR(11) PRIMARY KEY,
    nome VARCHAR(100),
    data_nascimento DATE,
    numero_agencia VARCHAR(10),
    numero_conta VARCHAR(15),
    telefone VARCHAR(15),
    endereco VARCHAR(255),
    perfil VARCHAR(50)
);

-- Tabela ativo_financeiro
CREATE TABLE ativo_financeiro (
    codigo VARCHAR(20) PRIMARY KEY,
    nome VARCHAR(100),
    descricao TEXT,
    emissor VARCHAR(100),
    data_inicio DATE,
    data_fim DATE
);

-- Tabela nota_corretagem
CREATE TABLE nota_corretagem (
    id INT PRIMARY KEY,
    data_compra DATE,
    codigo_ativo VARCHAR(20),
    quantidade_comprada INT,
    cotacao DECIMAL(10, 2),
    valor_compra DECIMAL(10, 2),
    FOREIGN KEY (codigo_ativo) REFERENCES ativo_financeiro(codigo)
);