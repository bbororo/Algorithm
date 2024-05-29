n = int(input())

star = "*"

for i in range(1, n+1):
    print((star * i) + ' ' * (n-i) + ' ' * (n-i) + (star * i))
for j in range(n-1, 0, -1):
    print((star * j) + ' ' * (n-j) + ' ' * (n-j) + (star * j))
    