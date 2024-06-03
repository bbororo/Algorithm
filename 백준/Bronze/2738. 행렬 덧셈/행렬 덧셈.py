n, m = map(int, input().split())

A = [[0] * m for _ in range(n)]
B = [[0] * m for _ in range(n)]
C = [[0] * m for _ in range(n)]

for i in range(len(A)):
    A[i] = list(map(int, input().split()))
for i in range(len(B)):
    B[i] = list(map(int, input().split()))

for i in range(len(A)):
    for j in range(len(A[i])):
        C[i][j] = A[i][j] + B[i][j]
        print(C[i][j], end=" ")
    print()