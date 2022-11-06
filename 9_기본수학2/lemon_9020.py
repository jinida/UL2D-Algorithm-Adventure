'''
골드바흐의 추측
https://www.acmicpc.net/problem/9020
11.03 레몬
'''

def is_prime(num):
    if num == 1:
        return False
    for i in range(2, int(num**0.5) + 1):
        if num % i == 0:
            return False
    return True

a = int(input())

for _ in range(0, a):
    num = int(input())
    
    N = num // 2
    M = num // 2
    while M < num:
        if is_prime(N) and is_prime(M):
            print(N, M)
            break
        N -= 1
        M += 1