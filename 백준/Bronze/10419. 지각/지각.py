T = int(input())

for i in range(T):
    d = int(input())  # 수업시간
    for j in range(10001):
        if j + j**2 > d:
            print(j-1)
            break