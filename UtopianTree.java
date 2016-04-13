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
            boolean spring = true;
            for (int i = 0; i < numOfCycle; i++) {
                if (spring) {
                    initHeight *= 2;
                    spring = false;
                } else {
                    initHeight += 1;
                    spring = true;
                }                
            }
            System.out.println(initHeight);
        }
        
        scan.close();
    }

}
