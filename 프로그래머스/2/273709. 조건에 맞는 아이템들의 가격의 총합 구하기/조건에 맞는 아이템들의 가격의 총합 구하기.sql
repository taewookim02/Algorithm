-- 코드를 작성해주세요
 # 희귀도가 'LEGEND'
 # 아이템들의 가격의 총합을 구하는 SQL문
 # 컬럼명은 'TOTAL_PRICE'
 SELECT SUM(PRICE) AS TOTAL_PRICE
 FROM ITEM_INFO
 WHERE RARITY = 'LEGEND';