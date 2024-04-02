# Write your MySQL query statement below



-- find the IDs of the invalid tweets
-- tweet is invalid if the number of characters used in  content of the tweet is greater than 15

SELECT tweet_id
FROM Tweets
WHERE LENGTH(content) > 15
;
