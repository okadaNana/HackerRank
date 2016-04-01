import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[][] = new int[n][n];
		for (int a_i = 0; a_i < n; a_i++) {
			for (int a_j = 0; a_j < n; a_j++) {
				a[a_i][a_j] = in.nextInt();
			}
		}
		in.close();
		
		int sum1 = 0;
		int sum2 = 0;
		for (int row = 0; row < n; row++) {
			for (int col = 0; col < n; col++) {
				if (row == col) {
					sum1 += a[row][col];
				} 
                
           if (row + col == n - 1) {  // can't not use "else if"
					sum2 += a[row][col];
				}
			}
		}
		System.out.println(Math.abs(sum1 - sum2));
	}
}
