# 용들은 오른쪽으로만 나아감
# 낮은 봉우리만 공격

n = int(input())  # 봉우리 겸 활잡이 수
high_peak = 0  # 제일 높은 봉우리
killed = 0  # 공격 가능한 수
max_killed = 0  # 제일 많은 공격 횟수
peak = list(map(int, input().split()))  # 왼 -> 오

for i in peak:
    if high_peak < i:  # 제일 높은 봉우리 보다 봉우리가 크면 공격 수 초기화
        killed = 0
        high_peak = i  # 제일 높은 봉우리 변경
    else:
        killed += 1
        if killed > max_killed:
            max_killed = killed
print(max_killed)