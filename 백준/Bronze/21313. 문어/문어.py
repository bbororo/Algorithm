N = int(input())

# n 짝수 1 2 1 2 ,n 홀수 1212123

if N % 2 == 0:
    print("1 2 " * (N // 2))
else:
    print("1 2 " * (N // 2) + "3", sep="")