
-- 1
SELECT COUNT(DISTINCT name)
FROM animal_ins

-- 2
SELECT animal_id, name, TO_CHAR(datetime, 'YYYY-MM-DD') ³¯Â¥
FROM animal_ins
ORDER BY animal_id

-- 3
SELECT animal_type, NVL(name, 'No name'), sex_upon_intake
FROM animal_ins
ORDER BY animal_id
