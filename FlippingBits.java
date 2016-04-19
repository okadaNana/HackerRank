import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            long num = scan.nextLong();
            System.out.println(0xFFFFFFFFL ^ num);
        }
        scan.close();
    }
}
