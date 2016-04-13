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
            int min = scan.nextInt();
            int max = scan.nextInt();
            
            int i = 1;
            int count = 0;
            while (i * i <= max) {                
                if (i * i >= min && i * i <= max) {
                    count++;
                }
                i++;
            }
            System.out.println(count);
        }
        
        scan.close();
    }

}
