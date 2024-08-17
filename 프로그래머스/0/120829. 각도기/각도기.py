def solution(angle):
    # 1 0도 초과 90도 미만은 예각, 
    # 2 90도는 직각, 
    # 3 90도 초과 180도 미만은 둔각 
    # 4 180도는 평각
    if angle > 0 and angle < 90:
        return 1
    elif angle == 90:
        return 2
    elif angle > 90 and angle < 180:
        return 3
    elif angle == 180:
        return 4