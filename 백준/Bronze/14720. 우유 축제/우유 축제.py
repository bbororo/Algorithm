
# 딸기0 -> 초코1 -> 바나나2 -> 딸기0

milk_mart = int(input())
kind_milk = list(map(int, input().split()))
milk_num = 0 # 우유 종류
ate_milk = 0 # 먹은 우유 갯수

for i in range(milk_mart):
    if milk_num == kind_milk[i]:
        ate_milk += 1
        milk_num += 1
    if milk_num > 2:
        milk_num = 0

print(ate_milk)

