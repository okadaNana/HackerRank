/*
 * https://www.hackerrank.com/challenges/maximum-element
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
        Stack<Integer> elementsStack = new Stack<>();
        Stack<Integer> maxValueStack = new Stack<>();
        for (int i = 0; i < N; i++) {
            int query = scan.nextInt();

            if (1 == query) {
                int element = scan.nextInt();
                elementsStack.push(element);
                if (maxValueStack.isEmpty() || maxValueStack.peek() <= element) { // don't forget use <=
                    maxValueStack.push(element);
                }
            } else if (2 == query) {
                int removeElement = elementsStack.pop();
                if (removeElement == maxValueStack.peek()) {
                    maxValueStack.pop();
                }
            } else if (3 == query) {
                System.out.println(maxValueStack.peek());
            }
        }
        scan.close();
    }
}
