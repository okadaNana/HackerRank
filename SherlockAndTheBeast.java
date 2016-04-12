import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        
        for (int k = 0; k < T; k++) {
            int input = scan.nextInt();
            
            if (input % 5 != 0 || input % 3 != 0) {
                System.out.println(-1);
                continue;
            }
                      
            for (int count_5 = input; count_5 >= 0; count_5--) {
                int count_3 = input - count_5;
                
                if (count_5 % 3 == 0) {
                    for (int i = 1; i <= count_5; i++) {
                        System.out.print(5);
                    }
                    for (int i = 1; i <= count_3; i++) {
                        System.out.print(3);
                    }
                    System.out.println();
                } else if (count_3 % 5 == 0) {
                    for (int i = 1; i <= count_5; i++) {
                        System.out.print(5);
                    }
                    for (int i = 1; i <= count_3; i++) {
                        System.out.print(3);
                    }
                    System.out.println();
                }
            }            
        }
        
        scan.close();
    }
}
