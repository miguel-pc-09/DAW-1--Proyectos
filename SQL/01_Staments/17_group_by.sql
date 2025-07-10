   --Trae una agrupacion agrupando las edades. trae una agrupacion maxima de edades.
   -- 12, 30, null, 15, 12, null Resultado->30, 15, 12
SELECT MAX(age) FROM users GROUP BY age;

   -- Trae una columna con la cuenta de edades. 12,30, 15, 12 Result->2, 1, 1
SELECT COUNT(age) FROM users GROUP BY age;

   -- Trae 2 veces la columna edad en una contando el numerode edades iguales, y en la otra ordenando las edades de 
   -- menor a mayor pero esto ultimo en ambas podria salir 0, 2, 1, 1 y en la otra null, 15, 20, 46
SELECT COUNT(age), age FROM users GROUP BY age ORDER BY age ASC;

   -- Mostraria dos columnas la cuenta de años y años en orden ascendente pero con el WHERE agre > 15 le decimos que los
   -- mayores de 15 años.
SELECT COUNT(age), age FROM users WHERE age > 15 GROUP BY age ORDER BY age ASC;