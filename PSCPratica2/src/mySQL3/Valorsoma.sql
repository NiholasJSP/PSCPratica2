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
ORDER BY
    soma_precos DESC;