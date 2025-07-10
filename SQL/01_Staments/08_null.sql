 -- Traeme de la tabla usuarios todos los que el email sea nulo
SELECT * FROM users WHERE email IS NULL;

 -- Traeme de la tabla usuarios todos los que el email no sea nulo
SELECT * FROM users WHERE email IS NOT NULL;

 -- Traeme de la tabla usuarios todos los que el email no sea nulo y ademas tengan 15 años
SELECT * FROM users WHERE email IS NOT NULL AND age = 15;

 -- En vez de traerme nulos le meto un valor por defecto, en este caso le decimos que en la columna edad los null
 -- los ponga como 0, y despues si ponemos AS age o AS edad, la tabla pasa a llamarse con ese alias en vez de ifnull
SELECT name, surname, IFNULL (age, 0) AS age FROM users 

 /*
    ISNULL 
 */
 
 -- Traera los campos nulos de la tabla
SELECT ISNULL(NULL);

 -- Obtiene el nombre, apellido, y edad de la tabla "users", y si la edad es nula la muestra como 0
SELECT name, username, IFNULL(age, 0) AS age FROM users;