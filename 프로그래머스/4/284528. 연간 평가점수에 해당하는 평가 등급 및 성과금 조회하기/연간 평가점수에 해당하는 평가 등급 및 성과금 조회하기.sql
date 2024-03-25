-- 코드를 작성해주세요
# HR_DEPARTMENT, HR_EMPLOYEES, HR_GRADE 테이블을
# 사원별 성과금 정보를 조회 
# 평가 점수별 등급과 


# 사번, 성명, 평가 등급, 성과금을 조회

# 평가등급의 컬럼명은 GRADE
# 성과금의 컬럼명은 BONUS
# 결과는 사번 기준으로 오름차순 정렬

# 등급에 따른 성과금 정보가 아래와 같을 때
# 96 이상	S	20%
# 90 이상	A	15%
# 80 이상	B	10%
# 이외	C	0%

SELECT 
    T.EMP_NO
    , T.EMP_NAME, 
    CASE 
        WHEN T.AVG_SCORE >= 96 THEN 'S'
        WHEN T.AVG_SCORE >= 90 THEN 'A'
        WHEN T.AVG_SCORE >= 80 THEN 'B'
        ELSE 'C'
    END GRADE
    , 
    T.SAL * 
    (CASE
        WHEN T.AVG_SCORE >= 96 THEN 0.2
        WHEN T.AVG_SCORE >= 90 THEN 0.15
        WHEN T.AVG_SCORE >= 80 THEN 0.1
        ELSE 0
    END) BONUS
    
FROM 
    (
        SELECT HE.EMP_NO, HE.EMP_NAME, SUM(HG.SCORE) / 2 AVG_SCORE, HE.SAL
        FROM HR_EMPLOYEES HE
        JOIN HR_GRADE HG ON HE.EMP_NO = HG.EMP_NO
        GROUP BY HG.EMP_NO
    ) T
    ORDER BY T.EMP_NO
;

