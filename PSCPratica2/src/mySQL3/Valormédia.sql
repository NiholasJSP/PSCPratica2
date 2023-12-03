SELECT
    f.nome AS fornecedor,
    AVG(p.preco) AS media_precos
FROM
    fornecedor f
JOIN
    produto_fornecedor pf ON f.id = pf.id_fornecedor
JOIN
    produto p ON pf.id_produto = p.id
GROUP BY
    f.nome
ORDER BY
    media_precos DESC;