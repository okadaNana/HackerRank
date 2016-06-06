#include <iostream>

using namespace std;

/*
Add `int max_of_four(int a, int b, int c, int d)` here.
*/
int max_of_four(int a, int b, int c, int d)
{
    /*
    int max = a;
    max = max > b ? max : b;
    max = max > c ? max : c;
    max = max > d ? max : d;
    return max;
    */
    
    int arr[] = {a, b, c, d};
    int max = arr[0];
    for (int i = 0; i < 4; i++)
    {
        max = max > arr[i] ? max : arr[i];
    }

    return max;
}

int main() 
{
    int a, b, c, d;
    scanf("%d %d %d %d", &a, &b, &c, &d);
    int ans = max_of_four(a, b, c, d);
    printf("%d", ans);
    
    return 0;
}
