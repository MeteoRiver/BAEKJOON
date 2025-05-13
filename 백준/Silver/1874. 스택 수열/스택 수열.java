import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int idx=0;
        int num=1;
        while(idx<n) {
            if (!stack.isEmpty() && stack.peek() == arr[idx]) {
                stack.pop();
                sb.append("-\n");
                idx++;
            }
            else if (num <=n) {
                stack.push(num++);
                sb.append("+\n");
            }else{
                System.out.println("NO");
                return;
            }
        }
        System.out.println(sb);
    }
}
