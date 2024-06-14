change = 1000 - int(input()) # 받을 거스름 돈
jpy_cnt = 0 # 잔돈 매수
money_list = [500, 100, 50, 10, 5, 1]

for i in money_list:
    jpy_cnt += change // i
    change %= i

print(jpy_cnt)