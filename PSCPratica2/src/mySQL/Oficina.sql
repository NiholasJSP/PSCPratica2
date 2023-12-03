-- Criação do banco de dados
CREATE DATABASE oficina;

-- Seleção do banco de dados
USE oficina;

-- Tabela cliente
CREATE TABLE cliente (
    CPF VARCHAR(11) PRIMARY KEY,
    nome VARCHAR(100),
    data_nascimento DATE,
    telefone VARCHAR(15),
    endereco VARCHAR(255)
);

-- Tabela veiculo
CREATE TABLE veiculo (
    chassi VARCHAR(17) PRIMARY KEY,
    placa VARCHAR(10),
    modelo VARCHAR(50),
    marca VARCHAR(50),
    ano INT
);

-- Tabela mecânico
CREATE TABLE mecanico (
    CPF VARCHAR(11) PRIMARY KEY,
    nome VARCHAR(100),
    data_nascimento DATE,
    telefone VARCHAR(15),
    endereco VARCHAR(255),
    salario DECIMAL(10, 2)
);