/*
SELECT <columns list> | * | <built-in functions>
FROM <tablenames> | <viewnames>
WHERE <row conditions>
GROUP BY <column list>
HAVING <group conditions>
ORDER BY <column list>
*/

-- SELECT

/* Change ordering */
SELECT *
FROM "RECENT_PRESIDENTS"
ORDER BY "YRS_SERV" DESC, "STATE_BORN"
/* Orders by years served, for presidents 
with the same number of years served will 
be ordered by state born */

/* Query with String */
SELECT *
FROM "RECENT_PRESIDENTS"
WHERE "PRES_NAME" = 'Carter J E'
/* Quotes are neccessary for strings */

/* Conditional Logic (AND, OR) */
SELECT *
FROM "RECENT_PRESIDENTS"
WHERE "PARTY" = 'Republican'
AND "STATE_BORN" = 'Texas'

SELECT *
FROM "RECENT_PRESIDENTS"
WHERE "PARTY" = 'Republican'
OR "STATE_BORN" = 'Texas'
/*And needs both conditions to be true
Or needs either to be true*/

/* Two ways for NOT */
SELECT *
FROM "RECENT_PRESIDENTS"
WHERE NOT "STATE_BORN" = 'Texas'

SELECT *
FROM "RECENT_PRESIDENTS"
WHERE "STATE_BORN" != 'Texas'
/* ^ is for oracle, ! is for postgres*/

/* Two ways for OR */
SELECT *
FROM "RECENT_PRESIDENTS"
WHERE "STATE_BORN"='Texas'
OR "STATE_BORN"='California'
OR "STATE_BORN"='Georgia'
OR "STATE_BORN"='New York'

SELECT *
FROM "RECENT_PRESIDENTS"
WHERE "STATE_BORN" IN ('Texas','California',
					   'Georgia','New York')


/* LIKE Keyword */

/* List all the presidents whose names has 
the letter e in the second position */
SELECT *
FROM "RECENT_PRESIDENTS"
WHERE "PRES_NAME" LIKE '_e%'
/* Output: Kennedy J F, Reagan R */
