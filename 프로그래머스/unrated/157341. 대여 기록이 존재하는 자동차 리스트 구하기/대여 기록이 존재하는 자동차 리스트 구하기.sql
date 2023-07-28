-- 코드를 입력하세요
SELECT DISTINCT car.CAR_ID
FROM CAR_RENTAL_COMPANY_CAR AS car
JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY AS his ON car.CAR_ID = his.CAR_ID
WHERE car.CAR_TYPE = '세단' && MONTH(his.START_DATE) = 10
ORDER BY CAR_ID DESC;
