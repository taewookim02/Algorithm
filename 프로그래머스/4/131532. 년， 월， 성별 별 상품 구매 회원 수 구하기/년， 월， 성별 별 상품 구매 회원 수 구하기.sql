-- 코드를 입력하세요
# USER_INFO 테이블과
# ONLINE_SALE 테이블에서
# 년, 월, 성별 별로
# 상품을 구매한 회원수를 집계

# 결과는 년, 월, 성별을 기준으로 오름차순 정렬
# 이때, 성별 정보가 없는 경우 결과에서 제외

# GENDER = 0 ? '남자' : '여자';


SELECT 
    YEAR(OS.SALES_DATE) YEAR
    , MONTH(OS.SALES_DATE) MONTH
    , UI.GENDER
    , COUNT(DISTINCT UI.USER_ID) USERS
FROM USER_INFO UI
JOIN ONLINE_SALE OS 
    ON (UI.USER_ID = OS.USER_ID)
WHERE UI.GENDER IS NOT NULL
GROUP BY YEAR, MONTH, UI.GENDER
ORDER BY YEAR, MONTH, UI.GENDER
;

# SELECT *
# FROM ONLINE_SALE;