/******************************************************************************

최소, 최대
(배열을 사용해서)
https://www.acmicpc.net/problem/10818

*******************************************************************************/

#include <iostream>

using namespace std;

int main()
{
    int N;
    cin >> N;
    int arr[N];
    int min = 1000001;
    int max = -1000001;
    for(int i=0;i<N;i++ ) {
        cin >> arr[i];
        if(arr[i] < min) {
            min = arr[i];
        }
        if (arr[i] > max) {
            max = arr[i];
        }
    }
    cout << min << " " << max;
    return 0;
}
