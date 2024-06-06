n = int(input())
passList = []
passLen = 0
passCenter = 0

for _ in range(n):
    password = input()
    passList.append(password)

for password in passList:
    if password[::-1] in passList:
        passLen = len(password)
        passCenter = password[len(password) // 2]
        break
print(passLen, passCenter)