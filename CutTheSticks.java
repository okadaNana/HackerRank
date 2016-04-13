import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();

        while (true) {
            int count = 0;
            int minLength = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (arr[i] > 0) {
                    if (arr[i] <= minLength) {
                        minLength = arr[i];
                    }
                    count++;
                }
            }
            for (int i = 0; i < n; i++) {
                arr[i] -= minLength;
            }
            if (count == 0) {
                break;
            } else {
                System.out.println(count);
            }
        }
    }
}
