-- Inserção de novas filiais
INSERT INTO filial (nome) VALUES ('Filial A'), ('Filial B');

-- Inserção de novos produtos
INSERT INTO produto (nome, valor, quantidade, id_filial) VALUES
    ('Produto 1', 3000.00, 5, 1),
    ('Produto 2', 2500.00, 3, 1),
    ('Produto 3', 2000.00, 4, 2),
    ('Produto 4', 1800.00, 2, 2);

-- Apresentação dos dados das filiais cuja soma dos produtos em estoque ultrapassa R$ 10.000,00
SELECT
    f.nome AS filial,
    SUM(p.valor) AS valor_total_por_filial
FROM
    produto p
JOIN
    filial f ON p.id_filial = f.id
GROUP BY
    f.nome
HAVING
    valor_total_por_filial > 10000.00;