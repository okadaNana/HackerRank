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
            char[] charArr = scan.next().toCharArray();
            char[] revCharArr = new char[charArr.length];

            for (int i = 0; i < charArr.length; i++) {
                revCharArr[i] = charArr[charArr.length - 1 - i];
            }

            boolean funny = true;
            for (int i = charArr.length - 1; i >= 1; i--) {
                if (Math.abs(charArr[i] - charArr[i - 1]) != Math.abs(revCharArr[i] - revCharArr[i - 1])) {
                    funny = false;
                }
            }

            System.out.println(funny ? "Funny" : "Not Funny");
        }
        scan.close();
    }
}