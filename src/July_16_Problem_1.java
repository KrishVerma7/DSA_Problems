/**
 * Q.1 .Valid parentheses problem
 * Desc:
 * You're given a string s containing only the characters '(', ')', '{', '}', '[' and ']'. You need to determine if the input string is valid according to the following rules:
 * - - Open brackets must be closed by the same type of brackets.
 * - - Open brackets must be closed in the correct order.
 * - - Every closing bracket must have a corresponding opening bracket of the same type
 */

import java.util.Stack;

/**
 * Approach 1 - just checking the elements of string
 */
public class July_16_Problem_1 {
    public boolean isValid(String s) {
        while (true) {
            if (s.contains("()")) {
                s = s.replace("()", "");
            } else if (s.contains("{}")) {
                s = s.replace("{}", "");
            } else if (s.contains("[]")) {
                s = s.replace("[]", "");
            } else {
                return s.isEmpty();
            }
        }
    }
}

/**
 * Approach 2 - Using Stack
 */
class July_16_Problem_1_Approach_2 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if ((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}


