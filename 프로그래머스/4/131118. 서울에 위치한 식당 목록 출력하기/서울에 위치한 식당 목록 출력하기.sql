-- 코드를 입력하세요
# REST_INFO와 REST_REVIEW 테이블에서
# 서울에 위치한 식당들의
# 식당 ID, 
# 식당 이름, 
# 음식 종류, 
# 즐겨찾기수, 
# 주소, 
# 리뷰 평균 점수를 조회
# 리뷰 평균점수는 소수점 세 번째 자리에서 반올림
# 결과는 평균점수를 기준으로 내림차순 정렬
# 평균점수가 같다면 즐겨찾기수를 기준으로 내림차순 정렬


SELECT 
    INFO.REST_ID
    , INFO.REST_NAME
    , INFO.FOOD_TYPE
    , INFO.FAVORITES
    , INFO.ADDRESS
    , ROUND(AVG(REVIEW.REVIEW_SCORE), 2) SCORE
FROM REST_INFO INFO
JOIN REST_REVIEW REVIEW 
ON INFO.REST_ID = REVIEW.REST_ID 
AND INFO.ADDRESS LIKE '서울%'
GROUP BY INFO.REST_ID
ORDER BY SCORE DESC, INFO.FAVORITES DESC
;
