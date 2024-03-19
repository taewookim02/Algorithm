-- 코드를 작성해주세요

# 잡은 물고기의 평균 길이를 출력하는 SQL문
# 평균 길이를 나타내는 컬럼 명은 AVERAGE_LENGTH
# 평균 길이는 소수점 3째자리에서 반올림
# 10cm 이하의 물고기들은 10cm 로 취급하여 평균 길이를 구해
# SELECT ROUND(235.415, 2) AS RoundValue;

SELECT ROUND(AVG(LENGTH), 2) AS AVERAGE_LENGTH
FROM (SELECT CASE
            WHEN LENGTH IS NULL THEN 10
            ELSE LENGTH
            END AS LENGTH
        FROM FISH_INFO) AS DFI;
        