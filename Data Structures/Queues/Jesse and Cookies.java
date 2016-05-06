/*
 * https://www.hackerrank.com/challenges/jesse-and-cookies
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numOfCookies = scan.nextInt();
		int minReqSweetness = scan.nextInt();
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(numOfCookies);
		for (int i = 0; i < numOfCookies; i++) {
			priorityQueue.add(scan.nextInt());
		}
		scan.close();
		
		boolean posibble = true;
		int count = 0;
		while (true) {
			if (priorityQueue.isEmpty()) {
				posibble = false;
				break;
			}
			
			int first = priorityQueue.remove();
			if (first >= minReqSweetness) {
				break;
			}
			if (priorityQueue.isEmpty()) {
				posibble = false;
				break;
			}
			
			int second = priorityQueue.remove();
			int sweetness = first + 2 * second;
			count++;
			priorityQueue.add(sweetness);
		}
		System.out.println(posibble ? count : -1);
	}

}
