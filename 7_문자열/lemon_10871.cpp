/**
 * X보다 작은수
 * https://www.acmicpc.net/problem/10871
 */
#include <iostream>

using namespace std;

int main()
{
    int N, X;
    cin >> N >> X;
    int arr[N];
    for (int i=0; i<N;i++) {
        cin >> arr[N];
        if(arr[i] < X) cout << arr[i] << " ";
    }
    return 0;
}