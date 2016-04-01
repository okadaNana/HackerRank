import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int t = 0; t < T; t++) {
            char[] charArr = scan.next().toCharArray();

            if (charArr.length == 1 || isPalindrome(charArr)) {
                System.out.println(-1);
                continue;
            }

            for (int idx = 0; idx < charArr.length; idx++) {
                int subIdx = 0;
                char[] temp = new char[charArr.length - 1];
                for (int i = 0; i < charArr.length; i++) {
                    if (i != idx) {
                        temp[subIdx] = charArr[i];
                        subIdx++;
                    }
                }
                if (isPalindrome(temp)) {
                    System.out.println(idx);
                    break;
                }
            }
        }
    }

    private static boolean isPalindrome(char[] charArr) {
        boolean isPalindrome = true;
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] != charArr[charArr.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        return isPalindrome;
    }

}