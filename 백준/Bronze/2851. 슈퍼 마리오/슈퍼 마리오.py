mushroom = []
score = 0

for _ in range(10):
    mushroom.append(int(input()))

for i in mushroom:
    score += i
    if score >= 100:
        # 100을 넘으면 이전값과 비교하여 100이랑 더 가까운값 찾기
        if score - 100 > 100 - (score - i):
            score -= i
            break
# 점수를 다 더해도 100이 안넘는 경우를 위해 if문 밖에서 처리
print(score)