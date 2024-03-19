-- 코드를 입력하세요
 # 2021년에 출판된
 # '인문' 카테고리에 속하는 도서 리스트
 # 출판일을 기준으로 오름차순 정렬
SELECT BOOK_ID, DATE_FORMAT(PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE
FROM BOOK
WHERE DATE_FORMAT(PUBLISHED_DATE, "%Y") = '2021'
AND CATEGORY = '인문'
ORDER BY PUBLISHED_DATE;

