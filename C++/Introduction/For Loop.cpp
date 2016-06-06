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
    int a;
    int b;

    cin >> a >> b;

    for (int num = a; num <=b; num++)
    {
        if (num >= 1 && num <= 9)
        {
            cout << strArr[num - 1] << endl;;
        } else if (num > 9) {
            if (num % 2 == 0)
            {
                cout << "even" << endl;
            }
            else 
            {
                cout << "odd" << endl;
            }
        }
    }

    return 0;
}
