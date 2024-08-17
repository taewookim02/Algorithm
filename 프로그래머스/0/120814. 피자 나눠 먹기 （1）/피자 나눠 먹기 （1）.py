from math import ceil
def solution(n):
    # 피자를 일곱 조각으로 잘라 줍니다
    # 모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return

    return ceil(n / 7)