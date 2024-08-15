def solution(num_list):
    
    # if len(num_list) >= 11 
    # sum
    if len(num_list) >= 11:
        return sum(num_list)
    else:
        starter = 1
        for num in num_list:
            starter *= num
        return starter
    # else 
    # multiply
    