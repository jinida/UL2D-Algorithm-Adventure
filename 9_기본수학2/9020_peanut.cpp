#include <iostream>
using namespace std;

int main() {
    int T;
    cin >> T;

    for (int i = 0; i < T; i++) {
        int n, n1, n2;
        cin >> n;
        if (n == 4) {
            cout << "2 2" << endl;
        }
        n1 = n / 2;
        if (n1 % 2 == 0) {
            n1--;
        }
        //cout << "n1 : " << n1 << endl;
        while (n1 > 2) {
            //소수인지 체크
            int check1 = 0, check2 = 0;
            for (int j = 2; j <= n1 / 2; j++) {
                if (n1 % j == 0) {
                    check1 = 1;
                    break;//소수 아님
                }
            }

            if (check1 == 0) {
                //cout << "소수임" << endl;
                n2 = n - n1;
                for (int j = 2; j <= n2 / 2; j++) {
                    if (n2 % j == 0) {
                        check2 = 1;
                        break;//소수 아님
                    }
                }
                if (check2 == 0) {
                    //cout << " n2 : " << n2 << endl;
                    cout << n1 << " " << n2 << endl;
                    break;
                }
                /*else {
                    cout << n2<<"n2 소수 아님" << endl;
                }*/
            }
            /*else {
                cout << "소수아님" << endl;
            }*/
            n1 -= 2;
        }
        //cout << "==============================" << endl;
    }
}