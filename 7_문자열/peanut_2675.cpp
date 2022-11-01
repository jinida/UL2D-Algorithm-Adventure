#include <string>
#include <iostream>
using namespace std;

int main() {
    int n;

    cin >> n;

    for (int i = 0; i < n; i++) {
        int num;
        string input;

        cin >> num >> input;

        for (int j = 0; j < input.length(); j++) {
            for (int k = 0; k < num; k++) {
                cout << input[j];
            }
        }
        cout << endl;
    }
    

    return 0;

}