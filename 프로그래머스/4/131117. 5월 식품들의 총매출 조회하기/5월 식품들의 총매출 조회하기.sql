-- 코드를 입력하세요

# FOOD_PRODUCT와 FOOD_ORDER 테이블에서
#  생산일자가 2022년 5월인 식품들의
# 식품 ID, 식품 이름, 총매출을 조회

# 결과는 총매출을 기준으로 내림차순 정렬
# 식품 ID를 기준으로 오름차순 정렬


SELECT FP.PRODUCT_ID, FP.PRODUCT_NAME, SUM(FO.AMOUNT) * PRICE TOTAL_SALES
FROM FOOD_PRODUCT FP
JOIN FOOD_ORDER FO
ON (FP.PRODUCT_ID = FO.PRODUCT_ID)
WHERE DATE_FORMAT(FO.PRODUCE_DATE, '%Y-%m') = '2022-05'
GROUP BY FP.PRODUCT_ID
ORDER BY TOTAL_SALES DESC, FP.PRODUCT_ID
;


