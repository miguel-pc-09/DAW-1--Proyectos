 -- Nos treaera la tabla usuario ordenando tood por la edad de menor a mayor, los null van primeros--
SELECT * FROM users ORDER BY age;

-- Traera la tabla ordenada ascendentemente --
SELECT * FROM users ORDER BY age ASC;

 -- Traera la tabla ordenada Descendentemente--
SELECT * FROM users ORDER BY age DESC;

 -- Traera la tabla ordenada Descendentemente por la edad y los usuarios con el correo sara@gmail.com--
SELECT * FROM users WHERE email='sara@gmail.com' ORDER BY age DESC;

 -- Traera de la columna nombre de la tabla usuario con el el correo sara@gmail.com ordenado por la edad descendente--
SELECT name FROM users WHERE email='sara@gmail.com' ORDER BY age DESC;