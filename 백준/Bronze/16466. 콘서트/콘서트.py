import sys

n = int(sys.stdin.readline())

nums = sorted(list(map(int, sys.stdin.readline().split())))
same = True

for i in range(n):
    if (i + 1) != nums[i]:
        print(i + 1)
        same = False
        break
if same:
    print(n + 1)