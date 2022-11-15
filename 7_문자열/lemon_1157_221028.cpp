/*
    단어공부
    https://www.acmicpc.net/problem/1157
    2022.10.28 레몬
*/
#include <iostream>
#include <algorithm>

using namespace std;

int main()
{
    // #1. 기본셋팅 & 입력받기
    string str;
    int max=0;
    cin >> str;
    
    // #2. 대문자->소문자 통일
    for (int i=0; i<str.size(); i++) {
        str[i] = tolower(str[i]);
    }
    cout << str << endl;
    
    // #3. 같은 영어끼리 정렬
    sort(str.begin(), str.end());
    cout << str << endl;

    // #4. 정렬된거 첫번째부터, 저장해서 이 첫번째 단어의 마지막(?)자리 추출
    
    int idx=0;
    while(true) {
        // #4-1 while 종료조건
        if(str.size() < idx) {
            break;
        }

        char a = str[idx];
        int last_idx = str.find_last_of(a);
        if(max < last_idx - idx + 1) {
            max = last_idx - idx + 1;
        }
        idx = idx + last_idx + 1;
    }

    cout << max;


    return 0;

}