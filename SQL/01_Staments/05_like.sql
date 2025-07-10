  -- Trae todos los usuarios que contengan en el email el "@gmail.com"--
SELECT * FROM users WHERE email LIKE '%@gmail.com';

  --  Obtiene todos los datosde la tabla "users" que contienen un email con el texto "sara" en su parte inicial
SELECT * FROM user WHERE email LIKE 'sara%';

  -- Trae todos los usuarios que contengan un @, y los null los dejaria fuera--
SELECT * FROM users WHERE email LIKE '%@%';