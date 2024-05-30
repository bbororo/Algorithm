n = int(input())
# 과일, 과일갯수를 받을 딕셔너리 생성
fruit = {}

for i in range(n):
    name, a = input().split()
    a = int(a)
    if name in fruit:
        fruit[name] += a
    else:
        fruit[name] = a

print("YES" if (5 in fruit.values()) else "NO")