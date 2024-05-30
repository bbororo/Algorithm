# 문자열로 숫자를 각각 받는다.
a, b = input().split()

# 숫자를 역순으로 저장한다.
a = int(a[::-1])
b = int(b[::-1])

print(max(a, b))