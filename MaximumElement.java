import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();
        Stack<Integer> maxValStack = new Stack<>();

        int N = scan.nextInt();
        for (int i = 0; i < N; i++) {
            int type = scan.nextInt();

            if (1 == type) {
                int x = scan.nextInt();
                if (maxValStack.isEmpty() || x >= maxValStack.peek()) {
                    maxValStack.push(x);
                }
                stack.push(x);
            } else if (2 == type) {
                int top = stack.pop();
                if (!maxValStack.isEmpty() && top == maxValStack.peek()) {
                    maxValStack.pop();
                }
            } else if (3 == type) {
                System.out.println(maxValStack.peek());
            }
        }

        scan.close();
    }
}
