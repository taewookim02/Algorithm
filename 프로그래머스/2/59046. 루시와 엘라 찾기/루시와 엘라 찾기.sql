-- 코드를 입력하세요
 # Lucy, Ella, Pickle, Rogan, Sabrina, Mitty인 동물의 아이디와 이름, 성별 및 중성화 여부를 조회
 # 아이디 순으로 조회
SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE
FROM ANIMAL_INS
WHERE NAME LIKE 'Lucy'
    OR NAME LIKE 'Ella'
    OR NAME LIKE 'Pickle'
    OR NAME LIKE 'Rogan'
    OR NAME LIKE 'Sabrina'
    OR NAME LIKE 'Mitty'
ORDER BY ANIMAL_ID;
