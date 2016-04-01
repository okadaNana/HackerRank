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
		    Set<Character> setA = new HashSet<>();
		    Set<Character> setB = new HashSet<>();
		    
		    String strA = scan.next();
		    String strB = scan.next();
		    
		    for (int i = 0; i < strA.length(); i++) {
		        setA.add(strA.charAt(i));
		    }
		    
		    for (int i = 0; i < strB.length(); i++) {
		        setB.add(strB.charAt(i));
		    }
		    
		    int[] charArray = new int[26];
		    for (char c : setA) {
		        charArray[c - 'a']++;
		    }
		    for (char c : setB) {
		        charArray[c - 'a']++;
		    }
		    
		    boolean flag = false;
		    for (int i = 0; i < 26; i++) {
		        if (charArray[i] > 1) {
		        	flag = true;
		        }
		    }
		    System.out.println(flag ? "YES" : "NO");
		}
		scan.close();
    }
}