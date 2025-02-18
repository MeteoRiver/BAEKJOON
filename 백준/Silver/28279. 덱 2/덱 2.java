import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int a = Integer.parseInt(st.nextToken());
            switch (a) {
                case 1 :
                    int b = Integer.parseInt(st.nextToken());
                    deque.addFirst(b);break;
                case 2 :
                    int c = Integer.parseInt(st.nextToken());
                    deque.addLast(c);break;
                case 3 :
                    if (deque.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.removeFirst());
                    }
                    break;
                case 4 :
                    if (deque.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.removeLast());
                    }
                    break;
                case 5 :
                    System.out.println(deque.size());break;
                case 6 :
                    if (deque.isEmpty()) {
                        System.out.println(1);
                    }
                    else {
                        System.out.println(0);
                    }break;
                case 7 :
                    if (deque.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.getFirst());
                    }
                    break;
                case 8 :
                    if (deque.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(deque.getLast());
                    }
                    break;
            }
        }


    }
}
