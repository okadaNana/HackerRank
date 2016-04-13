import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int V = scan.nextInt();
        int n = scan.nextInt();        
        for (int i = 0; i < n; i++) {
            int input = scan.nextInt();
            if (V == input) {
                System.out.println(i);
            }
        }        
        scan.close();
    }
}
