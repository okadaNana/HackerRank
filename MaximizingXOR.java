import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        int R = scan.nextInt();
        int max = -1;
        for (int i = L; i <= R; i++) {
            for (int k = L; k <= R; k++) {
                if ((i ^ k) > max) {
                    max = i ^ k;
                }
            }
        }
        System.out.println(max);
        scan.close();
    }
}
