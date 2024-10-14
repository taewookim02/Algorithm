def solution(n):
    answer = []
    answer.append(n)
    
    while (n != 1 and n != 0):
        if n % 2 == 0:
            # x가 짝수일 때는 2로 나누고, 
            n = n / 2
            answer.append(n)
        elif n % 2 == 1:
            # x가 홀수일 때는 3 * x + 1로 바꾸는 계산
            n = n * 3 + 1
            answer.append(n)
            
    return answer