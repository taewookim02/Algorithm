-- 코드를 입력하세요

# 각 아이스크림 성분 타입
# 성분 타입에 대한 아이스크림의 총주문량을
# 총주문량이 작은 순서대로 조회
# 이때 총주문량을 나타내는 컬럼명은 TOTAL_ORDER


SELECT II.INGREDIENT_TYPE, SUM(FH.TOTAL_ORDER) TOTAL_ORDER
FROM FIRST_HALF FH
JOIN ICECREAM_INFO II ON FH.FLAVOR = II.FLAVOR
GROUP BY II.INGREDIENT_TYPE
ORDER BY 2;




