-- Times --
INSERT INTO TIME (ID_TIME, NM_TIME) VALUES(1, 'Internacional');
INSERT INTO TIME (ID_TIME, NM_TIME) VALUES(2, 'Gremio');
INSERT INTO TIME (ID_TIME, NM_TIME) VALUES(3, 'Brasil de Pelotas');
INSERT INTO TIME (ID_TIME, NM_TIME) VALUES(4, 'Juventude');

-- Perfis --
INSERT INTO PERFIL(ID_PERFIL, NOME, EMAIL, ID_TIME,IMAGEM_PERFIL)
VALUES(1000, 'Arthur Lima de Souza', 'arthurlds73@gmail.com', 1, '/imgs/01-cnorris.png');

INSERT INTO PERFIL(ID_PERFIL, NOME, EMAIL, ID_TIME,IMAGEM_PERFIL)
VALUES(1001, 'Rafael de Souza', 'rafaeldesouza@gmail.com', 1, '/imgs/chaves.jpg');

INSERT INTO PERFIL(ID_PERFIL, NOME, EMAIL, ID_TIME,IMAGEM_PERFIL)
VALUES(1002, 'Mara Regina Lima de Souza', 'maralima@gmail.com', 1, '/imgs/donaflorinda.png');

INSERT INTO PERFIL(ID_PERFIL, NOME, EMAIL, ID_TIME,IMAGEM_PERFIL)
VALUES(1003, 'Larri Angeli de Souza', 'larridesouza@gmail.com', 1, '/imgs/seumadruga.jpg');

-- Usuários --
INSERT INTO USUARIO (ID_USUARIO, EMAIL, SENHA, ID_PERFIL) 
VALUES(1000, 'arthurlds73@gmail.com', '$2a$10$u1A9pPCNLpUiNwvREkHDOOivSthu28yRmNDddtOtykm6lBFVDD1S2', 1000);

INSERT INTO USUARIO (ID_USUARIO, EMAIL, SENHA, ID_PERFIL) 
VALUES(1001, 'rafaeldesouza@gmail.com', '$2a$10$u1A9pPCNLpUiNwvREkHDOOivSthu28yRmNDddtOtykm6lBFVDD1S2', 1001);

INSERT INTO USUARIO (ID_USUARIO, EMAIL, SENHA, ID_PERFIL) 
VALUES(1002, 'maralima@gmail.com', '$2a$10$u1A9pPCNLpUiNwvREkHDOOivSthu28yRmNDddtOtykm6lBFVDD1S2', 1002);

INSERT INTO USUARIO (ID_USUARIO, EMAIL, SENHA, ID_PERFIL) 
VALUES(1003, 'larridesouza@gmail.com', '$2a$10$u1A9pPCNLpUiNwvREkHDOOivSthu28yRmNDddtOtykm6lBFVDD1S2', 1003);







