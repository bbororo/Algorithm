import heapq
from sys import stdin

n = int(input())
heap = []

for i in range(n):
    a = int(stdin.readline())
    if a == 0:
        print(heapq.heappop(heap)) if heap else print(0)
    else:
        heapq.heappush(heap, a)


