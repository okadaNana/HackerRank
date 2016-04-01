import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int positive = 0;
        int negtive = 0;
        int zero = 0;
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            int element = in.nextInt();
            if (element > 0) {
               positive++;
            } else if (element == 0) {
               zero++; 
            } else {
               negtive++; 
            }
            
            arr[arr_i] = element;
        }
        in.close();
        
        System.out.printf("%.6f\n", positive * 1.0 / n);
        System.out.printf("%.6f\n", negtive * 1.0 / n);
        System.out.printf("%.6f\n", zero * 1.0 / n);
    }
}
