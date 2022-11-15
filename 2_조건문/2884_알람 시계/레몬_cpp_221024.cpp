/*
    알람시계
    https://www.acmicpc.net/problem/2884
*/
#include <iostream>

using namespace std;

int main()
{
    int H, M;
    cin >> H, M;

    if (M<45) {
        H = H-1;
        M = 60-(45-M);
    }
    if (H == -1) H = 23;
    
    cout << H << " " << M;
    return 0;
}