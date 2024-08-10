import java.util.Stack;

public class Solution {
    public static String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
        int len = number.length();

        for (int i = 0; i < len; i++) {
            char current = number.charAt(i);

            // k개 숫자를 제거할 때까지 스택의 마지막 숫자와 비교
            while (k > 0 && !stack.isEmpty() && stack.peek() < current) {
                stack.pop();
                k--;
            }

            stack.push(current);
        }

        // 만약 k가 0이 되지 않았으면 남아있는 k개를 제거
        while (k > 0) {
            stack.pop();
            k--;
        }

        // 스택의 숫자들을 문자열로 변환
        StringBuilder answer = new StringBuilder();
        for (char c : stack) {
            answer.append(c);
        }

        return answer.toString();
    }

}