T = int(input())

school = {}

for _ in range(T):
    cnt = int(input())
    for _ in range(cnt):
        key, value = input().split()
        school[key] = int(value)

    maxMount = max(school.values())

    for key, value in school.items():
        if value == maxMount:
            print(key)