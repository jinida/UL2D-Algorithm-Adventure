/*
    ㅍㄱㅇ ㄴㄱㅈ
    https://www.acmicpc.net/problem/4344
*/
#include <iostream>

using namespace std;

int main()
{
    ios::sync_with_stdio(false); cin.tie(NULL);
    int N, sum = 0;
    cin >> N;
    for (int i=0;i<N;i++ ) {
        int x, cnt=0;
        sum = 0;
        cin >> x;
        int arr[x];
        for (int j=0; j<x; j++) {
            cin >> arr[j];
            sum += arr[j];
        }
        float avg = (float)sum / (float)x;
        //cout << avg << "%\n";
        for (int j=0; j<x; j++) {
            if(arr[j] > avg) {
                cnt++;
            }
        }
        float avg2 = (float)cnt / (float)x * 100 ;
        cout.setf(ios::fixed);
        cout.precision(3);
        cout << avg2 << "%\n";
    }
    return 0;
}
