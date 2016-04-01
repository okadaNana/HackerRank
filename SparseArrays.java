import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String input = scan.next();
            Integer count = map.get(input);
            if (null == count) {
                map.put(input, 1);
            } else {
                map.put(input, count + 1);
            }
        }

        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            Integer count = map.get(scan.next());
            System.out.println(null == count ? 0 : count);
        }
        scan.close();
    }
}
