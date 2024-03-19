-- 코드를 입력하세요
    # 12세 이하
    # 여자환자
    # 전화번호가 없는 경우, 'NONE'으로 출력
    # 결과는 나이를 기준으로 내림차순 정렬
    # 나이 같다면 환자이름을 기준으로 오름차순 정렬
SELECT PT_NAME, PT_NO, GEND_CD, AGE, 
    CASE 
        WHEN TLNO IS NULL THEN 'NONE'
        ELSE TLNO
    END
FROM PATIENT
WHERE GEND_CD = 'W'
AND AGE <= 12
ORDER BY AGE DESC, PT_NAME ASC;
