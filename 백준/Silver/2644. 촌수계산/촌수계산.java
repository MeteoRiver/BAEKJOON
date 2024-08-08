import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n+1];
        int[][] arr1 = new int[n+1][n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());
        for(int i = 0; i < m; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st1.nextToken());
            int y = Integer.parseInt(st1.nextToken());
            arr1 [x][y] = arr1 [y][x] = 1;
        }
        dfs(first, second, n, arr1, arr);

        System.out.println(arr[second] == 0 ? -1 : arr[second]);


    }
    public static void dfs(int first, int second, int n, int[][] arr1, int[] arr){
        if(first == second){
            return;
        }
        for(int i = 1; i<=n ; i++){
            if(arr1[first][i]==1 && arr[i]==0){
                arr[i] = arr[first]+1;
                dfs(i, second, n, arr1, arr);
            }
        }
    }
}