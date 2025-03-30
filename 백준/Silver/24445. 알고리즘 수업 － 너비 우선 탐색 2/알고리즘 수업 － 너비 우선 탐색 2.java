import java.util.*;
import java.io.*;

public class Main {

    static int n,m,r;
    static ArrayList<Integer>[] graph;
    static int order = 1;
    static int[] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        graph = new ArrayList[n+1];
        visited = new int[n+1];

        for(int i = 1; i<n+1; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            graph[u].add(v);
            graph[v].add(u);
        }

        for(int i = 1; i<n+1; i++){
            Collections.sort(graph[i],Collections.reverseOrder());
        }


        bfs(r);

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i<n+1; i++){
            sb.append(visited[i]).append("\n");
        }
        System.out.println(sb);
    }

    static void bfs(int start){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = order++;

        while(!queue.isEmpty()){
            int node = queue.poll();

            for(int next : graph[node]){
                if(visited[next]==0){
                    visited[next]=order++;
                    queue.add(next);
                }
            }
        }
    }



}

/*
    static void dfs(int node){
        visited[node] = order++;
        for(int node: graph[node]){
            if(visited[next]==0){
                dfs(next);
            }
        }
    }
 */