 -- Queremos que depues de realizar una busqueda de un usuario supera los 18 años diga que es mayor o menor de  edad 
 -- Traera una tabla completa pero con una columna mas en la que nos dira si es mayor de edad o no.
SELECT *,                                   -- Acedemos a todos los datos metemos una coma 
 CASE                                       -- lanzamos el caso                    
     WHEN age > 17 THEN 'Es mayor de edad'  -- si es mayor de
     ELSE 'Es menor de edad'                -- si es menor de edad
 END AS agetext                             -- ponemos un alias 
 FROM users;                                -- de latabla usuarios


 -- OTRA FORMA CON TRUE O FALSE 
 /*
 Obtiene todos los datos de la tabla "users" y establece condiiones de visualizacion de valores booleanos
  según el valor de la edad
 */
 SELECT *,                                   
 CASE                                                           
     WHEN age > 17 THEN TRUE 
     ELSE FALSE              
 END AS agetext                             
 FROM users; 

 -- La columna que antes decia mayor de edad o menor ahora pondra 1 o 0 dependiendo si es true o false

 /*OTRA FORMA MAS 
 Obtiene todos los datos de la tabla "users" y estabalece condiciones de visualizacion de cadenas de texto segun el
 el valor de la edad
 */
  SELECT *,                                   
 CASE                                                           
       WHEN age > 18 THEN 'Es mayor de edad'                         -- ponemos 18 si no saltaria la siguiente condicion
     WHERE age = 18 THEN 'Acaba de cumplir la mayoria de edad'
     ELSE 'Es menor de edad'             
 END AS '¿Es mayor de edad?'                            
 FROM users; 

 -- Traeria la tabla pero los usuarios igual a 18 pondria acaba de cumplir 18 años 