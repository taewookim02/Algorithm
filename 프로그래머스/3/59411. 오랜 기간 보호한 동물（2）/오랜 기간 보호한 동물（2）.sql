-- 코드를 입력하세요

# 입양을 간 동물 중
# 보호 기간이 가장 길었던 동물 두 마리의
# 아이디와 이름을 조회

# 결과는 보호 기간이 긴 순

SELECT T.ANIMAL_ID, T.NAME
FROM (
    SELECT AO.ANIMAL_ID, AO.NAME, AO.DATETIME - AI.DATETIME
    FROM ANIMAL_INS AI
    JOIN ANIMAL_OUTS AO ON AI.ANIMAL_ID = AO.ANIMAL_ID
    ORDER BY 3 DESC
    LIMIT 2
) T
;