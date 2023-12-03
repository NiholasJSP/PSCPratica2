INSERT INTO produtos (nome, descricao, preco) VALUES
('ProdutoE', 'Descrição ProdutoE', 60.00),
('ProdutoF', 'Descrição ProdutoF', 80.00),
('ProdutoF', 'Descrição ProdutoF', 40.00);

SELECT nome, SUM(preco) AS soma_precos
FROM produtos
GROUP BY nome
HAVING soma_precos > 100.00;