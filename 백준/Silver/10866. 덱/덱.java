import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            if (input.startsWith("push_front")) {
                int num = Integer.parseInt(input.split(" ")[1]);
                deque.addFirst(num);
            } else if (input.startsWith("push_back")) {
                int num = Integer.parseInt(input.split(" ")[1]);
                deque.addLast(num);
            } else if (input.equals("pop_front")) {
                sb.append(deque.isEmpty() ? -1 : deque.pollFirst()).append('\n');
            } else if (input.equals("pop_back")) {
                sb.append(deque.isEmpty() ? -1 : deque.pollLast()).append('\n');
            } else if (input.equals("size")) {
                sb.append(deque.size()).append('\n');
            } else if (input.equals("empty")) {
                sb.append(deque.isEmpty() ? 1 : 0).append('\n');
            } else if (input.equals("front")) {
                sb.append(deque.isEmpty() ? -1 : deque.peekFirst()).append('\n');
            } else if (input.equals("back")) {
                sb.append(deque.isEmpty() ? -1 : deque.peekLast()).append('\n');
            }
        }

        System.out.print(sb);
    }
}
