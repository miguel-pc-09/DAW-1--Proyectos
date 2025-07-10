/*
ALTER TABLE
ADD
*/

-- ADD: Añade un nuevo atributo surname a la tabla "users"
-- Queremos modificar la tabla users añadiendo la linea de apellido porque puede que se nos olvido
ALTER TABLE users
ADD surname varchar(150);


--RENAME COLUMN

-- RENAME COLUMN: Renombra el atributo surname a description en la tabla "users"
-- Ahora quiero renombrar la columna - RENAME COLUMN "columna" TO "nuevo nombre"
ALTER TABLE users
RENAME COLUMN surname TO description;


MODIFY COLUMN

-- MODIFY COLUMN: Modifica el tipo de dato del atributo description en la tabla "users"
-- Ahora el varchar que antes era de 150 quiero q sea de 250. con MODFY 
ALTER TABLE users
MODIFY COLUMN description varchar(250);


-- DROP COLUMN

-- DROP COLUMN: Elimina el atributo description en la tabla "users"
ALTER TABLE users
DROP COLUMN description;