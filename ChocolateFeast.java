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
            int n = scan.nextInt();  // money in pocket
            int c = scan.nextInt();  // price per chocolate
            int m = scan.nextInt();  // wrapper count per chocolate to exchange

            int totalEat = 0;
            int wrapperInHand = 0;

            int buy = n / c;
            totalEat += buy;
            wrapperInHand += buy;

            while (wrapperInHand >= m) {
                int exchange = wrapperInHand / m;
                totalEat += exchange;
                wrapperInHand = wrapperInHand % m + exchange;
            }
            System.out.println(totalEat);
        }
    }
}
