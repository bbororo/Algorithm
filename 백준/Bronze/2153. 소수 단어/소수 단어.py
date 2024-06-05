def check_prime_word(n):
    if n == 1:
        return "It is a prime word."
    for i in range(2, n):
        if n % i == 0:
            return "It is not a prime word."
    return "It is a prime word."


word = input()
total = 0

for i in word:
    if i.islower():
        total += ord(i) - 96
    else:
        total += ord(i) - 38
print(check_prime_word(total))
