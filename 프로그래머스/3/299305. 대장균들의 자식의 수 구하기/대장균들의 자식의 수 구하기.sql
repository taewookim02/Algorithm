-- 코드를 작성해주세요

# 대장균 개체의 ID(ID)와
# 자식의 수(CHILD_COUNT)를 출력

# 자식이 없다면 자식의 수는 0으로 출력
# 결과는 개체의 ID 에 대해 오름차순 정렬

SELECT ED.ID, COALESCE(T.CHILD_COUNT, 0) CHILD_COUNT
FROM ECOLI_DATA ED
LEFT JOIN 
(
    SELECT ED.ID, COUNT(*) CHILD_COUNT
    FROM ECOLI_DATA ED
    JOIN 
    (
        SELECT ID, PARENT_ID
        FROM ECOLI_DATA ED2
    ) ED2 ON ED.ID = ED2.PARENT_ID
    GROUP BY ED.ID
) T ON ED.ID = T.ID
ORDER BY 1
;

