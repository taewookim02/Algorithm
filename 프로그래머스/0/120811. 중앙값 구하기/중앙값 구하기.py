import math
def solution(array):
    # sort
    array.sort()
    
    return array[math.trunc(len(array) / 2)]