-- 코드를 작성해주세요
# 수원 지역
# 연도 별 평균 미세먼지 오염도 (PM10)
# 연도 별 평균 초미세먼지 오염도를 조회 (PM2.5)
# 값은 소수 셋째 자리에서 반올림
# 결과는 연도를 기준으로 오름차순 정렬
SELECT DISTINCT YEAR(YM) AS "YEAR", 
ROUND(AVG(PM_VAL1), 2) AS "PM10", 
ROUND(AVG(PM_VAL2), 2) AS "PM2.5"
FROM AIR_POLLUTION
WHERE LOCATION2 LIKE '수원'
GROUP BY YEAR
ORDER BY YEAR ASC;