
import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int check[];
    static int Bridge[];
    static int dir[] = {1, -1};
    static int count = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        Bridge = new int[n];
        check = new int[n]; // 방문 한곳
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            Bridge[i] = Integer.parseInt(st.nextToken());
        }

        int s = Integer.parseInt(br.readLine());
        System.out.println(bfs(s-1));

    }

    public static int bfs(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);
        check[node] = 1; // 방문한 곳 체크
        while (!queue.isEmpty()) {
            node = queue.poll();
            int jump = Bridge[node];
            for (int d : dir) {
                int direction = (d * jump) + node;
                if (direction >= 0 && direction < n && check[direction] == 0) {
                    check[direction] = 1;
                    queue.offer(direction);
                    count++;
                }
            }
        }
        return count;
    }
}

