from collections import Counter



a = input().upper()
numList = []

# 한 문자씩 쪼개서 저장
for i in range(len(a)):
    numList += [a[i]]

# cnt에 빈도 저장
cnt = Counter(numList).most_common()

# 요소가 1이라면 그대로 출력
if len(cnt) == 1:
    print(cnt[0][0])

# 최빈값이 두개일경우
elif cnt[0][1] == cnt[1][1]:
    print("?")
# 나머지 최빈값이 하나일 때
else:
    print(cnt[0][0])






