import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            if (isValidParentheses(input)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }


    private static boolean isValidParentheses(String input) {
        Stack<Character> stack = new Stack<>();

        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);

            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
