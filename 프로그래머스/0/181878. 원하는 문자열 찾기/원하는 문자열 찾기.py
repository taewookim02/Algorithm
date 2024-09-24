def solution(myString, pat):    
    str_a = myString.lower()
    str_b = pat.lower()
    
    if str_b in str_a:
        return 1
    else: 
        return 0

    