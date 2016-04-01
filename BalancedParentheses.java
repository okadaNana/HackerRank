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
            System.out.println(isBalanced(scan.next().toCharArray()) ? "YES" : "NO");
        }
    }

    private static boolean isBalanced(char[] parentheses) {
        Stack<Character> stack = new Stack<>();
        boolean balanced = true;
        int index = 0;

        while (index < parentheses.length && balanced) {
            char parenthese = parentheses[index];
            if (parenthese == '(' || parenthese == '{' || parenthese == '[') {
                stack.push(parenthese);
            } else {
                if (stack.isEmpty()) {
                    balanced = false;
                } else {
                    switch (stack.pop()) {
                        case '(':
                            balanced = (parenthese == ')');
                            break;

                        case '{':
                            balanced = (parenthese == '}');
                            break;

                        case '[':
                            balanced = (parenthese == ']');
                            break;

                        default:
                            balanced = false;
                    }
                }
            }

            index++;
        }

        return (balanced && stack.isEmpty());
    }
}

