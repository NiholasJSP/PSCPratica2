-- Inserção de novos fornecedores
INSERT INTO fornecedor (nome) VALUES ('Fornecedor A'), ('Fornecedor B'), ('Fornecedor C');

-- Inserção de novos produtos
INSERT INTO produto (nome, preco) VALUES ('Produto 1', 100.00), ('Produto 2', 200.00), ('Produto 3', 300.00);

-- Inserção de relação produto-fornecedor
INSERT INTO produto_fornecedor (id_produto, id_fornecedor) VALUES (1, 1), (2, 1), (3, 2);

-- Apresentação dos dados dos fornecedores cuja soma dos produtos ultrapassa R$ 500,00
SELECT
    f.nome AS fornecedor,
    SUM(p.preco) AS soma_precos
FROM
    fornecedor f
JOIN
    produto_fornecedor pf ON f.id = pf.id_fornecedor
JOIN
    produto p ON pf.id_produto = p.id
GROUP BY
    f.nome
HAVING
    soma_precos > 500.00;