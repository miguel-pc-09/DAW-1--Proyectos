  -- Traera de la base de datos usuarios las columnas nombre y fecha que esten en el rango de 20 a 30 años y ademas
  -- con el AS cambiaremos el nombre init_date por el alias "fecha de inicio en programacion"
SELECT name, init_date AS 'fecha de inicio en programacion' FROM users WHERE age BETWEEN 2O AND 30; 

-- Misma consulta pero con comillas dobles
SELECT name, init_date AS "fecha de inicio en programacion" FROM users WHERE age BETWEEN 2O AND 30;

