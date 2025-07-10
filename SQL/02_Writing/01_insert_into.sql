-- Inserta un registro con identificador, nombre y apellido en la tabla "user".** Los values en el mismo orden
INSERT INTO users (user_id, name, surname) VALUES (8, 'Juan', 'Juanito');

 -- SIEMPRE Y CUANDO NUESTRA TABALA TENGA POR INCREMENTADOR AUTO PODEMOS OBVIAR EL USER_ID
--Inserta un registro con un nombre y apellido en la tabla "user"
INSERT INTO users (name, surname) VALUES ('Paco', 'Leon');

-- Inserta un registro con identificador no correlativo, nombre y apellido en la tabl "user"
INSERT INTO users (user_id, name, surname) VALUES (11, 'El', 'Merma');