-- 코드를 작성해주세요

# DEVELOPERS 테이블에서
# Python이나 C# 스킬을 가진 개발자의 정보를 조회
# 조건에 맞는 개발자의 ID, 이메일, 이름, 성을 조회



SELECT DISTINCT D.ID, D.EMAIL, D.FIRST_NAME, D.LAST_NAME
FROM DEVELOPERS D
JOIN SKILLCODES S ON (D.SKILL_CODE & S.CODE) > 0
AND S.NAME IN ("Python", "C#")
ORDER BY D.ID
;


