def solution(strArr):
    answer = []
    # 홀수 = lower
    for idx, str in enumerate(strArr):
        # 0 = 홀수
        if idx % 2 == 0:
            answer.append(str.lower())
        else:
            answer.append(str.upper())
        
    return answer