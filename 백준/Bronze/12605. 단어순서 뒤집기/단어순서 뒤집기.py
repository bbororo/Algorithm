n = int(input())
for i in range(n):
    string = input().split()
    print('Case #' + str(i+1) + ':', end=" ")
    for j in range(len(string)):
        print(string.pop(), end=" ")
    print()