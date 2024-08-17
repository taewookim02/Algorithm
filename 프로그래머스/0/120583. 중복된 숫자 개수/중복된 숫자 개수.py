def solution(array, n):
    answer = 0
    for num in array:
        if n == num:
            answer += 1
    return answer