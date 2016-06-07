#include <iostream>

using namespace std;

int main() 
{
    string a;
    string b;
    cin >> a >> b;
    cout << a.size() << " " << b.size() << endl;
    cout << a + b << endl;

    string a_ = a;
    a_[0] = b[0];

    string b_ = b;
    b_[0] = a[0];

    cout << a_ << " " << b_ << endl;

    return 0;
}
