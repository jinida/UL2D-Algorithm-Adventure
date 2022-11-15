/*
    A/B
    https://www.acmicpc.net/problem/1008
*/
#include <iostream>

using namespace std;

int main()
{
    double N, M;
    cin >> N >> M;
    cout.precision(10); // 상대오차가 10-9 이내여야 하므로, 소수점 아래 11자리에서 반올림
    cout << N/M;
    
    return 0;
}