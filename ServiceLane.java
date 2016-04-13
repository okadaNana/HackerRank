import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        int T = scan.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        for (int t = 0; t < T; t++) {
            int i = scan.nextInt();
            int j = scan.nextInt();

            int min = arr[i];
            for (int k = i; k <= j; k++) {
                if (arr[k] <= min) {
                    min = arr[k];
                }
            }
            System.out.println(min);
        }
        scan.close();
    }
}
