-- 코드를 작성해주세요

# FISH_INFO 테이블에서
# 2021년도에 잡은 물고기
# 수를 출력
# 컬럼명은 'FISH_COUNT' 


SELECT COUNT(*) FISH_COUNT
FROM FISH_INFO
WHERE YEAR(TIME) = '2021'
;
