def solution(x, n):
    answer = []
    start = x
    for _ in range(n):
        answer.append(x)
        x += start
        
    return answer