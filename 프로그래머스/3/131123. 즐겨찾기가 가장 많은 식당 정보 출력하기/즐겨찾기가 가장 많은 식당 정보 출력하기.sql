-- 코드를 입력하세요

# REST_INFO 테이블에서
# 음식종류별로 즐겨찾기수가 가장 많은 식당의
# 음식 종류, ID, 식당 이름, 즐겨찾기수를 조회
# 결과는 음식 종류를 기준으로 내림차순 정렬

-- 음식종류별로 즐겨찾기수가 가장 많은 식당
# SELECT FOOD_TYPE, MAX(FAVORITES)
# FROM REST_INFO MAXR
# GROUP BY FOOD_TYPE;

SELECT R.FOOD_TYPE, R.REST_ID, R.REST_NAME, MAXR.MAXFAV
FROM REST_INFO R
JOIN (
        SELECT 
            MAXR.FOOD_TYPE
            , MAXR.REST_NAME
            , MAX(MAXR.FAVORITES) MAXFAV
        FROM REST_INFO MAXR
        GROUP BY FOOD_TYPE
    ) AS MAXR 
    ON R.FOOD_TYPE = MAXR.FOOD_TYPE
    AND R.FAVORITES = MAXR.MAXFAV
GROUP BY R.FOOD_TYPE
ORDER BY R.FOOD_TYPE DESC
;