def solution(n):
    # n이하의 짝수를 모두 더한 값을 return
    answer = 0
    for i in range(0, n + 1, 2):
        answer += i
    return answer