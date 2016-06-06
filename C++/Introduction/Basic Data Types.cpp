#include <iostream>

using namespace std;

int main()
{
    int intVal;
    long longVal;
    long long longlongVal;
    char charVal;
    float floatVal;
    double doubleVal;

    scanf("%d %ld %lld %c %f %lf", &intVal, &longVal, &longlongVal, &charVal, &floatVal, &doubleVal);

    printf("%d\n", intVal);
    printf("%ld\n", longVal);
    printf("%lld\n", longlongVal);
    printf("%c\n", charVal);
    printf("%f\n", floatVal);
    printf("%lf\n", doubleVal);
    
    return 0;
}
