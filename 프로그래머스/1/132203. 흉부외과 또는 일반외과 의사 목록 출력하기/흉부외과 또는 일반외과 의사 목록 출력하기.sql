-- 코드를 입력하세요
# 진료과가 흉부외과(CS)이거나 일반외과(GS)인
# SELECT * FROM DOCTOR

SELECT DR_NAME, DR_ID, MCDP_CD, DATE_FORMAT(HIRE_YMD, '%Y-%m-%d') AS HIRE_YMD
FROM DOCTOR
WHERE MCDP_CD = 'CS' OR MCDP_CD = 'GS'
ORDER BY HIRE_YMD DESC, DR_NAME ASC;