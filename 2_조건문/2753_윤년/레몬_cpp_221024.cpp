/*
    윤년
    https://www.acmicpc.net/problem/2753
*/
#include <iostream>

using namespace std;

int main()
{
    int N;
    if(N%4==0 && (N%100!=0 || N%400==0)) cout << 1;
    else cout << 0;
    return 0;
}