/*
    두 수 비교하기
    https://www.acmicpc.net/problem/1330
*/
#include <iostream>

using namespace std;

int main()
{
    int N, M;
    cin >> N >> M;
    if (N>M) cout << ">";
    else if(N<M) cout << "<";
    else "==";

    return 0;
}