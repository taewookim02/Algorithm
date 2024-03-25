-- 코드를 작성해주세요
# FISH_INFO에서 
# 평균 길이가 33cm 이상인
# 물고기들을 종류별로 
# 잡은 수, 최대 길이, 물고기의 종류를 출력

# 결과는 물고기 종류에 대해 오름차순으로 정렬
# 10cm이하의 물고기들은 10cm로 취급
# 평균 길이를 구하시오

# 컬럼명은 물고기의 종류 'FISH_TYPE'
# 잡은 수 'FISH_COUNT'
# 최대 길이 'MAX_LENGTH'

SELECT T.FISH_COUNT, T.MAX_LENGTH, T.FISH_TYPE
FROM 
(
    SELECT COUNT(*) FISH_COUNT, MAX(LENGTH) MAX_LENGTH, FISH_TYPE, AVG(COALESCE(LENGTH, 10)) AVG_LENGTH
    FROM FISH_INFO
    GROUP BY FISH_TYPE
) T
WHERE T.AVG_LENGTH >= 33
ORDER BY T.FISH_TYPE
;








