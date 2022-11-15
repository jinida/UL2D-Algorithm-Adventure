/*
    달팽이는올라가고싶다
    https://www.acmicpc.net/problem/2869
    2022.10.27 레몬
*/
#include <iostream>

using namespace std;

int main()
{
    int A,B,V,W,n;
    cin >> A >> B >> V;
    W = V-B;
    n = (V-A+(A-B))/(A-B);
    if(W <= n*(A-B)) {
        cout << n;
    } else {
        cout << n+1;
    }
    
    return 0;
}