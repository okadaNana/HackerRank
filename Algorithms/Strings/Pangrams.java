import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                set.add((int) ch);
            } else if (ch >= 'A' && ch <= 'Z') {
                set.add((int) (ch + ('a' - 'A')));
            }
        }
        System.out.println(set.size() == 26 ? "pangram" : "not pangram");
    }
}
