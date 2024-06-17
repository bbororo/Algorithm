a, b = map(int, input().split())
arr = []

for i in range(1, b+1):  # 1부터 b까지 수열 만들기
    for j in range(i):
        arr.append(i)

print(sum(arr[a-1:b]))