create table tb_pessoa (
	id integer,
    nome varchar(200),
    idade integer(2)
);

create table tb_telefone (
	id integer,
    id_pessoa integer,
    numero varchar(20)
);


SELECT * FROM tb_pessoa WHERE idade > 27 and idade < 30;

SELECT * FROM tb_pessoa;
SELECT * FROM tb_telefone;

INSERT INTO TB_PESSOA VALUES(1, 'Fernando', 29);
INSERT INTO TB_PESSOA VALUES(3, 'Fernando', 27);
INSERT INTO TB_PESSOA VALUES(2, 'Fernando', 24);
INSERT INTO TB_PESSOA VALUES(4, 'Fernando', 30);
INSERT INTO TB_PESSOA VALUES(5, 'Frederico', 30);

INSERT INTO TB_TELEFONE VALUES(1, 1, '99998888');
INSERT INTO TB_TELEFONE VALUES(2, 1, '88889999');
INSERT INTO TB_TELEFONE VALUES(3, 2, '77777777');
----------------------------------------------------

1 --Apague a pessoa que tem o nome Frederico.
DELETE FROM tb_pessoa WHERE nome = 5;
---------------------------------------------------

2 --Altere o nome de todas as pessoas que começam com o nome 'Ren' para 'Fernando'.
UPDATE tb_pessoa
SET nome = 'Fernando'
WHERE nome LIKE 'Ren%';
---------------------------------------------------
3 --Faça uma query que traga o nome e o número do telefone (inclusive as pessoas sem número) 
--de todas as pessoas ordenadas em ordem crescente pelo número de telefone.
SELECT  p.nome,
        t.numero
FROM tb_pessoa p
LEFT JOIN tb_telefone t
ON p.id = t.id_pessoa
ORDER BY nome ASC;
--------------------------------------------------
4 --Me traga o nome e idade da segunda pessoa mais velha da tabela. 
SELECT * FROM tb_pessoa WHERE idade > 27 and idade < 30;


--------------------------------------------------


