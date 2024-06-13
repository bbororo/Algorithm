from itertools import permutations
card_cnt, selected_card = int(input()), int(input())

card_num = []
answer = set()
for _ in range(card_cnt):
    card_num.append(input())

for i in permutations(card_num, selected_card):
    answer.add(''.join(i))

print(len(answer))
