-- 코드를 입력하세요
# 컬럼(컬럼명: AVAILABILITY)을 추가
# 2022년 10월 16일에 대여 중인 자동차인 경우 '대여중' 
# 대여 중이지 않은 자동차인 경우 '대여 가능'을 표시
# 자동차 ID와 AVAILABILITY 리스트를 출력
# 반납 날짜가 2022년 10월 16일인 경우에도 '대여중'으로 표시
# 결과는 자동차 ID를 기준으로 내림차순 정렬

SELECT CAR_ID, 
    CASE
        WHEN SUM(
            CASE 
                WHEN '2022-10-16' BETWEEN H.START_DATE AND H.END_DATE THEN 1
                ELSE 0
            END
        ) = 1 THEN '대여중'
        ELSE '대여 가능'
    END AS AVAILABILITY
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY AS H
GROUP BY CAR_ID
ORDER BY CAR_ID DESC;