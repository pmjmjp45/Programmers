-- 코드를 입력하세요
SELECT outs.ANIMAL_ID, outs.NAME
FROM ANIMAL_INS AS ins
JOIN ANIMAL_OUTS AS outs ON ins.ANIMAL_ID = outs.ANIMAL_ID
ORDER BY DATEDIFF(ins.DATETIME, outs.DATETIME)
LIMIT 2