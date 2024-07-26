import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 입력을 받기 위한 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 첫 번째 줄: 학생 수 N
        int n = Integer.parseInt(br.readLine());
        
        // 두 번째 줄: 학생들의 번호표 순서
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = Integer.parseInt(st.nextToken());
        }
        
        // 두 개의 스택 사용
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        
        // stack에 역순으로 학생들의 번호표 삽입
        for (int i = n - 1; i >= 0; i--) {
            stack.push(s[i]);
        }
        
        int count = 1;  // 목표 숫자
        while (!stack.isEmpty() || !stack2.isEmpty()) {
            if (!stack2.isEmpty() && stack2.peek() == count) {
                stack2.pop();
                count++;
            } else if (!stack.isEmpty() && stack.peek() == count) {
                stack.pop();
                count++;
            } else if (!stack.isEmpty()) {
                stack2.push(stack.pop());
            } else {
                break;
            }
        }
        
        // 결과 판단
        String result = stack2.isEmpty() ? "Nice" : "Sad";
        System.out.println(result);
    }
}