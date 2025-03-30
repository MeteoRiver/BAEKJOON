import java.util.*;
import java.io.*;

public class Main {

    static ArrayList<Integer>[] graph;
    static int orders = 1;
    static int[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        graph = new ArrayList[n + 1];
        visited = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(graph[i], Collections.reverseOrder());
        }

        dfs(r);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(visited[i]).append("\n");
        }
        System.out.print(sb);
    }

    public static void dfs(int node) {
        visited[node] = orders++;

        for (int next : graph[node]) {
            if (visited[next] == 0) {
                dfs(next);
            }
        }
    }
}
