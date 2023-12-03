INSERT INTO produtos (nome, descricao, preco) VALUES
('ProdutoD', 'Descrição ProdutoD', 20.00),
('ProdutoD', 'Descrição ProdutoD', 30.00);

SELECT nome, AVG(preco) AS media_precos
FROM produtos
GROUP BY nome;