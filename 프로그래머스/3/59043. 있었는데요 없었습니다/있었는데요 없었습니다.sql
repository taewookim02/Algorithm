-- 코드를 입력하세요
# 일부 동물의 입양일이 잘못 입력되었습니다
# 보호 시작일보다 입양일이 더 빠른 동물
# 아이디와 이름을 조회
# 결과는 보호 시작일이 빠른 순


# 보호 시작일보다 입양일이 더 빠른 동물
# IF OUTS.DATETIME < INS.DATETIME
SELECT AI.ANIMAL_ID, AI.NAME
FROM ANIMAL_INS AI
JOIN ANIMAL_OUTS AO ON AI.ANIMAL_ID = AO.ANIMAL_ID
WHERE AO.DATETIME < AI.DATETIME
ORDER BY AI.DATETIME;