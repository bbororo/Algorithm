arr = [int(input()) for _ in range(9)]
arr.sort()
fake1, fake2 = 0, 0

for i in range(9):
    for j in range(i+1, 9):
        if sum(arr) - (arr[i] + arr[j]) == 100:
            fake1 = arr[i]
            fake2 = arr[j]
            
arr.remove(fake2)
arr.remove(fake1)

for i in arr:
    print(i)