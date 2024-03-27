-- 코드를 입력하세요
# USED_GOODS_BOARD와 USED_GOODS_USER 테이블에서 
# 게시물을 3건 이상 등록한 사용자의
# 사용자 ID, 닉네임, 전체주소, 전화번호를 조회

# 전체 주소는 시, 
# 도로명 주소, 
# 상세 주소가 함께 출력

# 전화번호의 경우 xxx-xxxx-xxxx 형태로 출력

# 회원 ID를 기준으로 내림차순 정렬

SELECT 
    GU.USER_ID
    , GU.NICKNAME 
    , CONCAT_WS(' ', GU.CITY, GU.STREET_ADDRESS1, GU.STREET_ADDRESS2) 전체주소
    , CONCAT_WS('-', SUBSTR(GU.TLNO, 1, 3), SUBSTR(GU.TLNO, 4, 4), SUBSTR(GU.TLNO, 8, 4)) 전화번호
FROM USED_GOODS_USER GU
JOIN USED_GOODS_BOARD GB ON GU.USER_ID = GB.WRITER_ID
GROUP BY GU.USER_ID
HAVING COUNT(*) >= 3
ORDER BY GU.USER_ID DESC
;


