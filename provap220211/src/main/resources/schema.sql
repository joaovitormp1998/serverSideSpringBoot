CREATE TABLE produto (
                               id INT PRIMARY KEY,
                               name VARCHAR(50),
                               img VARCHAR(100),
                               odPrice FLOAT,
                               price FLOAT,
                               description VARCHAR (230),
                               codigo_installments int

);
CREATE TABLE installments (     codigo int,
                                qtd int,
                                value float
);