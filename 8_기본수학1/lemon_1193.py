'''
    분수찾기
    https://www.acmicpc.net/problem/1193
    레몬 2022.11.02
'''

X = int(input())

s=0
i=1
while(True):
    s = s + i
    if X <= s:
        break
    i = i+1

mv = s - X

# 짝수는 y가 1부터 증가, 홀수는 x가 1부터 증가
if i % 2 == 0 :
    print("%s%s%s" %(i-mv,'/',1+mv))
else:
    print("%s%s%s" %(1+mv,'/',i-mv))