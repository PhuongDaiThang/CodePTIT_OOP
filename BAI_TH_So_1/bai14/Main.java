package bai14;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numTests = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < numTests; i++) {
            String sentence = sc.nextLine().trim();
            if (isBalanced(sentence)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean isBalanced(String sentence) {
        Stack<Character> stack = new Stack<>();
        for (char ch : sentence.toCharArray()) {
            if (ch == '(' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}