'''
베르트랑 공준
https://www.acmicpc.net/problem/4948
11.03 레몬
'''

MAX_N = 246913

prime_num = [True] * (MAX_N+1)
prime_num[0] = False
prime_num[1] = False

for i in range(2, MAX_N+1):
    if prime_num[i] == True:
        j = 2
        while(i*j) <= MAX_N:
            prime_num[i*j] = False
            j+=1

while True:
    N = int(input())
    if N==0:
        break

    count = 0
    for i in range(N+1, 2*N+1):
        if prime_num[i] == True:
            count = count + 1
    print(count)