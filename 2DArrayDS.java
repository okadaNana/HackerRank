import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                int sum = 0;
                
                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        sum += arr[i][j];
                    }
                }
                
                sum -= arr[row+1][col];
                sum -= arr[row+1][col + 2];
                
                if (sum >= max) {
                    max = sum;
                }
            }
        }
        
        System.out.println(max);
    }
}
