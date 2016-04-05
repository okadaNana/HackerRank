import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int sum1 = 0;
        int sum2 = 0;
        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){
                int input = in.nextInt();
                
                if (row == col) {
                    sum1 += input;
                }
                if (row + col == n - 1) {
                    sum2 += input;
                }
            }
        }
        in.close();
        
        System.out.println(Math.abs(sum1 - sum2));
    }
}
