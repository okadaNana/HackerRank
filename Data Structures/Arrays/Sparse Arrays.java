/*
 * https://www.hackerrank.com/challenges/sparse-arrays
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);

    	int N = scan.nextInt();
    	Map<String, Integer> map = new HashMap<>(N);
    	for (int i = 0; i < N; i++) {
    		String inputStr = scan.next();
    		Integer count = map.get(inputStr);
    		if (null == count) {
    			map.put(inputStr, 1);
    		} else {
    			map.put(inputStr, count + 1);
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
