n = int(input())
row = 0
col = 0
rowBed = 0
colBed = 0
arr = [list(input()) for _ in range(n)]

for i in range(n):
    row = 0
    for j in range(n):
        if arr[i][j] == '.':
            row += 1
        else:
            row = 0
        if row == 2:
            rowBed += 1

for j in range(n):
    col = 0
    for i in range(n):
        if arr[i][j] == '.':
            col += 1
        else:
            col = 0
        if col == 2:
            colBed += 1

print(rowBed, colBed)