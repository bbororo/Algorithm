t = int(input())


for i in range(t):
    r, str = input().split()
    r = int(r)
    for c in range(len(str)):
        print(r*str[c], end='')
        
    print()