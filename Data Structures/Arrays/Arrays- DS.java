import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
        	arr[i] = scan.nextInt();
        }

        for (int i = N - 1; i >= 0; i--) {
        	System.out.print(arr[i] + " ");
        }
    }
}
