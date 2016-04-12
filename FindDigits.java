import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for(int t = 0; t < T; t++){
            int num = scan.nextInt();
            int temp = num;
            int count = 0;
            
            while (temp != 0) {
                int reminder = temp % 10;
                if (reminder != 0 && num % reminder == 0) {
                    count++;
                }
                temp /= 10;
            }
            System.out.println(count);
        }

        scan.close();
    }
}
