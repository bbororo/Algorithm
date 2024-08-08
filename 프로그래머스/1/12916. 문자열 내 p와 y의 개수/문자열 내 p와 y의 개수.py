def solution(s):
    answer = True
    
    s = s.lower()
    pcnt = 0
    ycnt = 0
    for i in s:
        if i == 'p':
            pcnt += 1
        elif i == 'y':
            ycnt += 1
    if(pcnt != ycnt):
        answer = False
        
    return answer