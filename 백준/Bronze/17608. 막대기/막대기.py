import sys

input = sys.stdin.readline

n = int(input())
maxNum = 0
cnt = 0

# 가장 마지막 원소와 앞 원소들의 키를 비교 cnt +1
numList = []
for _ in range(n):
    numList.append(int(input()))

for i in reversed(numList):
    if maxNum < i:
        maxNum = i
        cnt += 1
print(cnt)