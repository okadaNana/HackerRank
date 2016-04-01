import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			char[] charArray = scan.next().toCharArray();
			if (charArray.length == 0) {
				System.out.println(0);
				continue;
			}
			
			int count = 0;
			int preIdx = 0;
			for (int idx = 1; idx < charArray.length; idx++) {
				if (charArray[idx] == charArray[preIdx]) {
					count++;
				}
				preIdx = idx;
			}
			System.out.println(count);
		}
		
		scan.close();
    }
}