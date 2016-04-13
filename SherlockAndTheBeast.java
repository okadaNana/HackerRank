import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        
        for (int t = 0; t < T; t++) {
            int digitsCount = scan.nextInt();
            
            boolean has = false;
            for (int digit_5 = digitsCount; digit_5 >= 0; digit_5--) {
                int digit_3 = digitsCount - digit_5;
                
                if (digit_5 % 3 == 0 && digit_3 % 5 == 0) {
                	has = true;
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < digit_5; i++) {
                        sb.append(5);
                    }
                    for (int i = 0; i < digit_3; i++) {
                        sb.append(3);
                    }
                    System.out.println(sb.toString());
                    break;
                }
            }
            if (!has) {
                System.out.println(-1);
            }
        }
        scan.close();
    }

}
