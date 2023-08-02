-- 코드를 입력하세요
SELECT CAR_ID, 
    CASE 
        WHEN SUM(CASE 
                    WHEN DATE_FORMAT(START_DATE, '%Y-%m-%d') <= '2022-10-16'
                        && DATE_FORMAT(END_DATE, '%Y-%m-%d') >= '2022-10-16'
                    THEN 1
                    ELSE 0
                END) >= 1
        THEN '대여중'
        ELSE '대여 가능'
    END AS AVAILABILITY
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY CAR_ID
ORDER BY CAR_ID DESC

# SELECT * FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY ORDER BY CAR_ID