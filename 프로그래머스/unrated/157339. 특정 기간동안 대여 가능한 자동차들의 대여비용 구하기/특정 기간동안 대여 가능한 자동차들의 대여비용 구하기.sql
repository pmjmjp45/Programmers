-- 코드를 입력하세요
SELECT DISTINCT car.CAR_ID, car.CAR_TYPE, 
    FLOOR((DAILY_FEE * 30 * (100 - (plan.DISCOUNT_RATE)) / 100)) AS FEE
FROM CAR_RENTAL_COMPANY_CAR AS car
JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY AS his 
    ON car.CAR_ID = his.CAR_ID
JOIN CAR_RENTAL_COMPANY_DISCOUNT_PLAN AS plan
    ON car.CAR_TYPE = plan.CAR_TYPE
WHERE car.CAR_ID NOT IN (SELECT his2.CAR_ID 
                         FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY AS his2
                         WHERE (END_DATE >= '2022-11-01' && START_DATE < '2022-11-30')
                            && his2.CAR_ID = car.CAR_ID)
    && plan.DURATION_TYPE = '30일 이상'
    && car.CAR_TYPE IN ('세단', 'SUV')
GROUP BY car.CAR_ID
HAVING
    FEE >= 500000
    && FEE < 2000000
ORDER BY FEE DESC, car.CAR_TYPE ASC, CAR_ID DESC


# select cpcar.CAR_ID, cpcar.CAR_TYPE, FLOOR(cpcar.DAILY_FEE * 30 * (1 - DISCOUNT_RATE * 0.01)) as FEE
# from CAR_RENTAL_COMPANY_CAR as cpcar
#     left join CAR_RENTAL_COMPANY_RENTAL_HISTORY as history
#         on cpcar.CAR_ID = history.CAR_ID
#             left join  CAR_RENTAL_COMPANY_DISCOUNT_PLAN as dct
#                 on  cpcar.CAR_TYPE = dct.CAR_TYPE
# where cpcar.CAR_TYPE in ('세단','SUV') 
#     and DURATION_TYPE = '30일 이상' 
# group by cpcar.CAR_ID
# having (max(END_DATE) < '2022-11-01' or max(END_DATE) is null) 
#     and FEE between 500000 and 2000000
# order by FEE desc, cpcar.CAR_TYPE asc, PLAN_ID desc

# SELECT * FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY ORDER BY CAR_ID