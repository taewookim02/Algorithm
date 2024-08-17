import math
def solution(num1, num2):
    # num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return
    answer = (num1 / num2) * 1000
    
    return math.trunc(answer)