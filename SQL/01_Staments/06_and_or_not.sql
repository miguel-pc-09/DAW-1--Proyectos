    -- Traeria aquellos usuarios que NO tengan el email sara@gmail.com --
SELECT * FROM users WHERE NOT email='sara@gmail.com';

    -- Traeria aquellos usuarios que NO tengan el email sara@gmail.com y ademas tengan 15 años --
SELECT * FROM users WHERE NOT email='sara@gmail.com' AND age = 15;

    -- Traeria aquellos usuarios que NO tengan el email sara@gmail.com O tengan 15 años --
SELECT * FROM users WHERE NOT email='sara@gmail.com' OR age = 15;