import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		int[] alphabets = new int[26];
		Set<Character> set = new HashSet<>();
		int count = 0;

		for (int i = 0; i < N; i++) {
		    char[] rock = scan.next().toCharArray();
		    
		    for (char c : rock) {
		        set.add(c);
		    }
		    
		    for (char c : set) {
		        int idxOfAlphabets = c - 'a';
		        alphabets[idxOfAlphabets]++;
		        if (alphabets[idxOfAlphabets] >= N) {
		        	count++;
		        }
		    }
		    
		    set.clear();
		}
		
		System.out.println(count);
		
		scan.close();
	}

}