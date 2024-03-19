-- 코드를 입력하세요
# 2021년에 가입한 회원 중 
# 20세 이상 29세 이하인 회원이 몇 명
SELECT COUNT(USER_ID)
FROM USER_INFO
WHERE JOINED LIKE '%2021%'
AND AGE BETWEEN 20 AND 29;