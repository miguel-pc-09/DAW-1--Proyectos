--WHERE Estamos limitando cual esel criterio de los datos que queremosrecuperar--

  -- Estamos pidiendo que traiga de la tabla los datos de los que tienen 15 años--
SELECT * FROM users WHERE age = 15;

  -- Traeria los datos en que los nombres de la tabla usuario tengan la edad de 15--  
SELECT name FROM users WHERE age = 15; 

 --Con DISTINCT-- 
  -- Traera dela tabla usuario los campos en el que el nombre sea distinto y ademas tengan 15 años.  
SELECT DISTINCT name FROM users WHERE age = 15;

-- Filtra todas las edades distintas de la tabla "users" con edad igual a 15
SELECT DISTINCT age FROM users WHERE age = 15;
