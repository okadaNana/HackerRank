#include <iostream>

using namespace std;

int main()
{
    string strArr[] = {
        "one",
        "two",
        "three",
        "four",
        "five",
        "six",
        "seven",
        "eight",
        "nine"
    };
 
    int inputNum;
    cin >> inputNum;

    if (inputNum >= 1 && inputNum <= 9) {
        cout << strArr[inputNum - 1];
    } else if (inputNum > 9) {
        cout << "Greater than 9";
    }

    return 0;
}
