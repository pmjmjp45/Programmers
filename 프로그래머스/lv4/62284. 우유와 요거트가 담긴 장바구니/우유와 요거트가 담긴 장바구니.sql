-- 코드를 입력하세요
SELECT DISTINCT a.CART_ID
FROM CART_PRODUCTS AS a
JOIN CART_PRODUCTS AS b ON a.CART_ID = b.CART_ID && b.ID > a.ID
WHERE (a.NAME = 'Milk' && b.NAME = 'Yogurt') || (a.NAME = 'Yogurt' && b.NAME = 'Milk')
ORDER BY a.CART_ID