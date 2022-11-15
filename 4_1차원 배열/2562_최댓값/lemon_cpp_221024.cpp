/*
    ㅊㄷㄱ
    https://www.acmicpc.net/problem/2562
*/
#include <iostream>

using namespace std;

int main()
{
    int arr[9];
    int max = 0;
    int idx = 1;
    for (int i=0; i<9 ;i++) {
        cin >> arr[i];
        if(max < arr[i]) {
            max = arr[i];
            idx = i+1;
        }
    }
    cout << max << '\n' << idx;
    return 0;
}
