-- 코드를 입력하세요
 # 만원 단위의 가격대 별로 
 # 상품 개수를 출력 (PRICE_GROUP, PRODUCTS)
 # 가격대 정보는 각 구간의 최소금액
 # 결과는 가격대를 기준으로 오름차순 정렬
SELECT FLOOR(PRICE / 10000) * 10000 AS PRICE_GROUP, COUNT(*)
FROM PRODUCT
GROUP BY PRICE_GROUP
ORDER BY PRICE_GROUP