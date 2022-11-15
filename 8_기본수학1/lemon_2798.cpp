/*
    블랙잭
    https://www.acmicpc.net/problem/2798
    2022.10.27 레몬
*/
#include <iostream>

using namespace std;

int main()
{
    // #1. 기본셋팅 & 입력받기
    int N, M, max=0;
    cin >> N >> M;
    int arr[N];
    for(int i=0;i<N;i++){
        cin >> arr[i];
    }
    
    // #2. 무지성 for
    for(int i=0; i<N-2; i++) {
        for(int j=i+1;j<N-1;j++) {
            for(int k=j+1;k<N;k++) {
                int sum = arr[i]+arr[j]+arr[k];
                if(max < sum && sum <= M ) {
                    max = sum;
                }
            }
        }
    }
    
    cout << max;
    
    return 0;
}