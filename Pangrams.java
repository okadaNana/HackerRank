import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] charArray = scan.nextLine().toLowerCase().toCharArray();
		scan.close();
		
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] >= 'a' && charArray[i] <= 'z') {
				hs.add((int) charArray[i]);
			}
		}
		
		System.out.println(hs.size() == 26 ? "pangram" : "not pangram");
    }
}