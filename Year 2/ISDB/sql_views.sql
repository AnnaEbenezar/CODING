/*
SELECT <columns list> | * | <built-in functions>
FROM <tablenames> | <viewnames>
WHERE <row conditions>
GROUP BY <column list>
HAVING <group conditions>
ORDER BY <column list>
*/

-- VIEWS

-- INITIAL VIEW
SELECT *
FROM "RECENT_PRESIDENTS"

-- Drop (Delete) view
DROP VIEW "RECENT_PRESIDENTS"

-- Create view 
CREATE VIEW "RECENT_PRESIDENTS" AS
SELECT *
FROM "PRESIDENT"
WHERE "BIRTH_YR" > 1880