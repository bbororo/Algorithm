arr = [list(map(int, input().split())) for _ in range(9)]

maxNum = 0
row = 0
col = 0

for i in range(9):
    for j in range(9):
        if maxNum <= arr[i][j]:
            maxNum = arr[i][j]
            row = i + 1
            col = j + 1
print(maxNum)
print(row, col, end=" ")