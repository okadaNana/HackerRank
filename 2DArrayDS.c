#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int arr[6][6];
    for (int row = 0; row < 6; row++)
    {
        for (int col = 0; col < 6; col++)
        {
            scanf("%d", &arr[row][col]);
        }
    }
    
    int max = INT_MIN;  // because input value may be negtive. can't use zero as initail value of max
    for (int row = 0; row < 4; row++)
    {
        for (int col = 0; col < 4; col++)
        {
            int sum = (arr[row][col] + arr[row][col + 1] + arr[row][col + 2] +
                                    arr[row + 1][col + 1] +
                    arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2]);
            
            if (sum >= max)
            {
                max = sum;
            }
        }
    }
    
    printf("%d", max);
    
    return 0;
}
