-- 코드를 입력하세요
WITH DURATION AS (
    SELECT HISTORY_ID, DATEDIFF(END_DATE, START_DATE) + 1 AS DAYS
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
)

SELECT his.HISTORY_ID, 
    FLOOR(DAILY_FEE * DAYS * (100 - (CASE 
                                    WHEN DAYS >= 90
                                    THEN (SELECT DISCOUNT_RATE
                                          FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN
                                          WHERE DURATION_TYPE = '90일 이상'
                                                && CAR_TYPE = '트럭') 

                                    WHEN DAYS < 90 && DAYS >= 30
                                    THEN (SELECT DISCOUNT_RATE
                                          FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN
                                          WHERE DURATION_TYPE = '30일 이상'
                                                && CAR_TYPE = '트럭')

                                    WHEN DAYS < 30 && DAYS >= 7
                                    THEN (SELECT DISCOUNT_RATE
                                          FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN
                                          WHERE DURATION_TYPE = '7일 이상'
                                                && CAR_TYPE = '트럭')
                                    ELSE 0
                                END)) / 100) AS FEE
FROM CAR_RENTAL_COMPANY_CAR AS car
JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY AS his
    ON car.CAR_ID = his.CAR_ID
JOIN DURATION AS d
    ON his.HISTORY_ID = d.HISTORY_ID
WHERE car.CAR_TYPE = '트럭'
ORDER BY FEE DESC, his.HISTORY_ID DESC

# SELECT history_id, round(daily_fee * (timestampdiff(day, start_date, end_date)+1) * (100 - (
#     case
#         when (timestampdiff(day, start_date, end_date)+1) >= 90
#         then (select discount_rate from car_rental_company_discount_plan where duration_type = '90일 이상' and car_type = '트럭')
#         when (timestampdiff(day, start_date, end_date)+1) >= 30
#         then (select discount_rate from car_rental_company_discount_plan where duration_type = '30일 이상' and car_type = '트럭')
#         when (timestampdiff(day, start_date, end_date)+1) >= 7
#         then (select discount_rate from car_rental_company_discount_plan where duration_type = '7일 이상' and car_type = '트럭')
#         else 0
#     end
# )) * 0.01) fee
# from car_rental_company_rental_history history join car_rental_company_car using(car_id)
# where car_type = '트럭'
# order by fee desc, history_id desc;