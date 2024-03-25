-- 코드를 작성해주세요
# FISH_NAME_INFO에서 
# 물고기의 종류 별
# 물고기의 이름과 잡은 수를 출력

# 물고기의 이름 컬럼명은 FISH_NAME
# 잡은 수 컬럼명은 FISH_COUNT
# 결과는 잡은 수 기준으로 내림차순 정렬



SELECT COUNT(*) FISH_COUNT, FNI.FISH_NAME
FROM FISH_INFO FI
JOIN FISH_NAME_INFO FNI ON FI.FISH_TYPE = FNI.FISH_TYPE
GROUP BY FNI.FISH_NAME
ORDER BY FISH_COUNT DESC;


