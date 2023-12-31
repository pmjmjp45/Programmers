-- 코드를 입력하세요
SELECT YEAR(SALES_DATE) AS YEAR, MONTH(SALES_DATE) AS MONTH, GENDER, COUNT(DISTINCT sale.USER_ID) AS USERS 
FROM ONLINE_SALE AS sale
JOIN USER_INFO AS info ON sale.USER_ID = info.USER_ID
WHERE info.GENDER IS NOT NULL
GROUP BY YEAR(SALES_DATE), MONTH(SALES_DATE), GENDER
ORDER BY YEAR, MONTH, GENDER

# SELECT *, COUNT(*) FROM ONLINE_SALE GROUP BY SALES_DATE