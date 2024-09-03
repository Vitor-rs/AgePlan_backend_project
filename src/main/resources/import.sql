-- Inserção de dados na tabela Endereco
INSERT INTO endereco (id, cep, tipo_logradouro, nome_logradouro, numero, complemento, bairro, cidade, uf)
VALUES
(1, '12345-678', 'Rua', 'Paulista', '1000', 'Apt 12', 'Centro', 'São Paulo', 'SP'),
(2, '23456-789', 'Avenida', 'Rio Branco', '500', 'Bloco B', 'Centro', 'Rio de Janeiro', 'RJ'),
(3, '34567-890', 'Rua', 'Sete de Setembro', '200', '', 'Centro', 'Curitiba', 'PR');

-- Inserção de dados na tabela Roles
INSERT INTO roles (id, nome_role)
VALUES
(1, 'ROLE_ADMIN'),
(2, 'ROLE_USER');

-- Inserção de dados na tabela Privilegios
INSERT INTO privilegios (id, nome_privilegio)
VALUES
(1, 'PRIVILEGIO_LEITURA'),
(2, 'PRIVILEGIO_ESCRITA');

-- Inserção de dados na tabela Usuario (assumindo uma tabela de subclass específica, ex: UsuarioCliente)
INSERT INTO usuario (id, nome_usuario, senha, email, numero_celular)
VALUES
(1, 'admin', '$2a$10$xyzxyzxyzxyzxyzxyzxyzxyzxyz', 'admin@example.com', '11999999999'),
(2, 'user', '$2a$10$abcabcabcabcabcabcabcabcabcabc', 'user@example.com', '11888888888');

-- Inserção de relacionamento entre Usuario e Roles
INSERT INTO usuario_roles (usuario_id, roles_id)
VALUES
(1, 1), -- Admin com Role de Admin
(2, 2); -- User com Role de User

-- Inserção de relacionamento entre Usuario e Privilegios
INSERT INTO usuario_privilegios (usuario_id, privilegio_id)
VALUES
(1, 1), -- Admin com Privilegio de Leitura
(1, 2), -- Admin com Privilegio de Escrita
(2, 1); -- User com Privilegio de Leitura
