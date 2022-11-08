#include <cmath>
#include <iostream>
using namespace std;

int main() {
	int A, B, V;
	cin >> A >> B >> V;
	if (V == A) {
		cout << 1;
		return 0;
	}
	if ((V - B) % (A - B)==0) {
		cout << (V - B) / (A - B);
	}
	else {
		cout << (V - B) / (A - B)+1;
	}
	
	//cout << (V - B) / (A - B)+1;

	return 0;
}