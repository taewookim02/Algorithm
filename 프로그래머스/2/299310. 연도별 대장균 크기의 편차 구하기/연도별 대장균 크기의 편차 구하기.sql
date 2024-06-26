-- 코드를 작성해주세요

# 분화된 연도(YEAR)
# 분화된 연도별 대장균 크기의 편차(YEAR_DEV)
# 대장균 개체의 ID(ID)
# 출력

# 연도에 대해 오름차순으로 정렬
# 같은 연도에 대해서는 대장균 크기의 편차에 대해 오름차순


SELECT 
    YEAR(DIFFERENTIATION_DATE) YEAR
    , T.MAX_SIZE - ED.SIZE_OF_COLONY YEAR_DEV
    , ED.ID
FROM ECOLI_DATA ED
JOIN ( 
    SELECT YEAR(DIFFERENTIATION_DATE) YEAR_T, MAX(SIZE_OF_COLONY) MAX_SIZE
    FROM ECOLI_DATA
    GROUP BY YEAR(DIFFERENTIATION_DATE)
) T ON YEAR(ED.DIFFERENTIATION_DATE) = T.YEAR_T
ORDER BY YEAR, YEAR_DEV
;

-- get max per year
# SELECT YEAR(DIFFERENTIATION_DATE) YEAR, MAX(SIZE_OF_COLONY)
# FROM ECOLI_DATA
# GROUP BY YEAR(DIFFERENTIATION_DATE)
# ;
 
 
