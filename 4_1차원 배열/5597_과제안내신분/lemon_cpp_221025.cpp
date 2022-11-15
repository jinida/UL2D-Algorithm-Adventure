/**
*   ㄱㅈㅇㄴㅅㅂ..?
*   https://www.acmicpc.net/problem/5597
**/


#include <iostream>
#include <algorithm>
 
using namespace std;
 
int main(int argc, const char * argv[]) {
	ios::sync_with_stdio(false); cin.tie(NULL);
 
	int arr[31] = {0,};
	int N;
	for(int i = 0; i < 28; i++) {
		cin >> N;
		arr[N] = 1;
	}
 
	for (int i = 1; i <= 30; i++) {
	    if(arr[i] == 0) cout << i << '\n';
	}
	return 0;
 
}
