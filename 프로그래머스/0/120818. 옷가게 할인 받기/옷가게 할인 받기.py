def solution(price):
    # 10만 원 이상 사면 5%
    # 30만 원 이상 사면 10%
    # 50만 원 이상 사면 20%를 할인
    if price >= 500000:
        return (price * 0.8) // 1
    elif price >= 300000:
        return (price * 0.9) // 1
    elif price >= 100000:
        return (price * 0.95) // 1
    else:
        return price
    