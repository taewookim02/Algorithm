-- 코드를 입력하세요
# 2022년 5월에 예약한
# 환자 수를 진료과코드 ('진료과코드', '5월예약건수')
# 결과는 진료과별 예약한 환자 수를 기준으로 오름차순 정렬
# 예약한 환자 수가 같다면 진료과 코드를 기준으로 오름차순 정렬
SELECT MCDP_CD AS '진료과코드', COUNT(*) AS '5월예약건수'
FROM APPOINTMENT
WHERE DATE_FORMAT(APNT_YMD, '%Y-%m') LIKE '%2022-05%'
GROUP BY MCDP_CD
ORDER BY COUNT(*) ASC, MCDP_CD ASC;