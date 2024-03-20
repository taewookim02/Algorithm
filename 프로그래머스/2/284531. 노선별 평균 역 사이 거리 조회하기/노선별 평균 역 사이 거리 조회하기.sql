-- 코드를 작성해주세요
# 노선별로 
# 노선, 
# 총 누계 거리,  (역 사이 거리의 총 합, 소수 둘째자리 반올림)
# 평균 역 사이 거리 (평균 역 사이 거리, 소수 셋째 자리 반올림, 단위 (km)를 함께 출력)
# 노선별로 조회
# 결과는 총 누계 거리를 기준으로 내림차순 정렬

SELECT ROUTE, CONCAT(ROUND(SUM(D_BETWEEN_DIST), 1), 'km') AS "TOTAL_DISTANCE", CONCAT(ROUND(AVG(D_BETWEEN_DIST), 2), 'km') AS "AVERAGE_DISTANCE"
FROM SUBWAY_DISTANCE
GROUP BY ROUTE
ORDER BY 1 DESC;



