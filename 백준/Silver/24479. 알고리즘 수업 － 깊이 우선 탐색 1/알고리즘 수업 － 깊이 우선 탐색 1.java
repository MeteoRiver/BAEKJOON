import java.io.*;
import java.util.*;

class Main {

    static int n,m,r;
    static ArrayList<Integer>[] graph;
    static int[] visited;
    static int order = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        graph = new ArrayList[n+1];
        visited = new int[n+1];

        for (int i = 0; i < n+1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u =Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(graph[i]);
        }

        dfs(r);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(visited[i]).append("\n");
        }
        System.out.println(sb);

    }

    static void dfs(int node) {
        visited[node] = order++;

        for(int next:graph[node]){
            if(visited[next]==0){
                dfs(next);
            }
        }
    }
}