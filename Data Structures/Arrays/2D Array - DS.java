/*
 * https://www.hackerrank.com/challenges/2d-array
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] _2DArr = new int[6][6];
        for (int row = 0; row < 6; row++) {
        	for (int col = 0; col < 6; col++) {
        		_2DArr[row][col] = scan.nextInt();
        	}
        }

        int max = Integer.MIN_VALUE;
        for (int row = 0; row < 4; row++) {
        	for (int col = 0; col < 4; col++) {
        		int sum = _2DArr[row][col] + _2DArr[row][col + 1] + _2DArr[row][col + 2] +
        				  					_2DArr[row + 1][col + 1] +
        				  _2DArr[row + 2][col] + _2DArr[row + 2][col + 1] + _2DArr[row + 2][col + 2];

        		if (sum > max) {
        			max = sum;
        		}
        	}
        }
        System.out.println(max);

        scan.close();
    }
}
