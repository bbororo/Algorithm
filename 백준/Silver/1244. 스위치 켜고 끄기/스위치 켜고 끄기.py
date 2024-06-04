switchCnt = int(input())
switchStatus = list(map(int, input().split()))
studentCnt = int(input())

for _ in range(studentCnt):
    gender, num = map(int, input().split())
    # 남자
    if gender == 1:
        for i in range(num-1, switchCnt, num):
            switchStatus[i] = 1 if switchStatus[i] == 0 else 0
    # 여자
    else:
        i = 0
        while (num-i-1 >= 0 and num+i-1 < switchCnt):
            if switchStatus[num-i-1] == switchStatus[num+i-1]:
                if switchStatus[num-i-1] == 1:
                    switchStatus[num-i-1] = 0
                    switchStatus[num+i-1] = 0
                else:
                    switchStatus[num-i-1] = 1
                    switchStatus[num+i-1] = 1
                i += 1
            else:
                break
cnt = 0
for switch in switchStatus:
    if(cnt % 20 == 0 and cnt != 0):
        print()
    print(int(switch), end=" ")
    cnt += 1