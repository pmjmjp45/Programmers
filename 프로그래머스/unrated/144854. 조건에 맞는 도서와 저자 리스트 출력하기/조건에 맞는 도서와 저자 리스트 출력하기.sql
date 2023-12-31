-- 코드를 입력하세요
# SELECT BOOK_ID, AUTHOR_NAME, SUBSTRING(PUBLISHED_DATE, 1, 10) AS PUBLISHED_DATE
# FROM BOOK AS a
# JOIN AUTHOR AS b ON a.AUTHOR_ID = b.AUTHOR_ID
# WHERE a.CATEGORY = '경제'
# ORDER BY PUBLISHED_DATE ASC;

SELECT b.BOOK_ID, a.AUTHOR_NAME, SUBSTRING(b.PUBLISHED_DATE, 1, 10)
FROM BOOK AS b
JOIN AUTHOR AS a ON b.AUTHOR_ID = a.AUTHOR_ID
WHERE b.CATEGORY = '경제'
ORDER BY b.PUBLISHED_DATE ASC;