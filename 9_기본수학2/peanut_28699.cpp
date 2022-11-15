#include <iostream>
using namespace std;
//void sol_2869() {
//	int A, B, C, now = 0, cnt = 1, h;
//	float comp;
//
//	cin >> A >> B >> C;
//	
//
//	while (true) {
//		cnt++;
//		h += A;
//		//cout << "h : " << h << endl;
//		if (C <= h) {
//			break;
//		}
//		h -= B;
//
//		//cout << "h : " << h << endl<<endl;
//	}
//}
void sol_10250() {
	int H, W, N;
	cin >> H >> W >> N;
	int **rooms = new int*[H];

	for (int i = 0; i < H; i++) {
		*rooms = new int[W];
		//fill_n(*rooms, W, 0);
	}
	//rooms = { 0, };
	for (int i = 0; i < H; i++) {
		for (int j = 0; j < W; j++) {
			cout << rooms[i][j] << " ";
		}
		cout << endl;
		cout << endl;
	}
	


}
int main() {
	

	sol_10250();
	

	//cout << cnt;
	return 0;
}