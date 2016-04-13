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
            int initHeight = 1;
            int numOfCycle = scan.nextInt();            
            for (int i = 0; i < numOfCycle; i++) {
                if (i % 2 == 0) {
                    initHeight *= 2;
                } else {
                    initHeight += 1;
                }                
            }
            System.out.println(initHeight);
        }
        
        scan.close();
    }

}
