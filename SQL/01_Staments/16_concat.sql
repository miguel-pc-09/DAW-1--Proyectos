-- Podemos poner espacio porque si no lo juntan poniendo '' entre la , y usersname
SELECT CONCAT(name, username) FROM users; -- Trae dos columnas en una

 -- Concatena en  sola columna, vendra Nombre: miguel Apellidos: perucha mas bonito
SELECT CONCAT('Nombre: ',name,'Apellidos: ' username) FROM users;

 -- Con esta variante el nombre de la columna en vez poner CONCAT pondria "Nombre completo"
SELECT CONCAT('Nombre: ',name,'Apellidos: ' username) AS 'Nombre completo' FROM users;