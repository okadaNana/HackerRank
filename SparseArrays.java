import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	int N = scan.nextInt();
    	String[] strArr = new String[N];
    	for (int i = 0; i < N; i++) {
    		strArr[i] = scan.next();
    	}
    	
    	int Q = scan.nextInt();
    	for (int i = 0; i < Q; i++) {
    		String queryStr = scan.next();
    		int count = 0;
    		for (int j = 0; j < strArr.length; j++) {
    			if (strArr[j].equals(queryStr)) {
    				count++;
    			}
    		}
    		System.out.println(count);
    	}
    	scan.close();
    }
}