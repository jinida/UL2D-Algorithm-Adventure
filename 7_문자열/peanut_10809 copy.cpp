#include <string>
#include <iostream>
using namespace std;

int main() {
   string input;

   cin >> input;

   int* flag = new int[26];

   fill_n(flag, 26, -1);

   for (int i = 0; i < input.length(); i++) {
       int comp = input[i] - 97;
       cout << "comp : " << comp << ", i : " << i << endl;
       if (0<=comp && comp<26 && flag[comp]==-1) {
           flag[comp] = i;
       }
   }
   for (int i = 0; i < 26; i++) {
       cout << flag[i] << " ";
   }


   return 0;

}