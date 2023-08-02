-- 코드를 입력하세요
SELECT *
FROM PLACES AS a
WHERE (SELECT COUNT(b.HOST_ID) FROM PLACES AS b WHERE a.HOST_ID = b.HOST_ID GROUP BY b.HOST_ID) >= 2
ORDER BY ID;