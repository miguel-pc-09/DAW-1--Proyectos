/*
VIEWS -> Es una representacion virtual de una o mas tablas. Es decir es como una tabla,
pero que en realidad no es una tabla, si no el resultado de una consulta como se representaria en formato tabla.
*/

-- Crea unaa vista llamada "v_adult_users" con los nombres y edades de usuarios de la table "users"
-- que tienen una edad igual o mayor a 18 años.
CREATE VIEW v_adult_users AS
SELECT name, age
FROM users
WHERE age >= 18;

-- Consulta la vista creada
SELECT * FROM v_adult_users;

-- Elimina la vista llamada "v_adult_users"
DROP VIEW v_adult_users;