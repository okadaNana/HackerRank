import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int positiveCount = 0;
        int negtiveCount = 0;
        int zeroCount = 0;
        for(int i = 0; i < n; i++){
            int input = in.nextInt();
            
            if (input > 0) {
                positiveCount++;
            } else if (input == 0) {
                zeroCount++;
            } else {
                negtiveCount++;
            }
        }
        in.close();
        
        System.out.printf("%.6f\n", positiveCount * 1.0 / n);
        System.out.printf("%.6f\n", negtiveCount * 1.0 / n);
        System.out.printf("%.6f\n", zeroCount * 1.0 / n);
    }
}
