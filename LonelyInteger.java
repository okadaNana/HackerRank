import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int xor = 0;
        for (int n = 0; n < N; n++) {
            int input = scan.nextInt();
            xor ^= input;
        }
        System.out.println(xor);
        scan.close();
    }
}
