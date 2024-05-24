        import java.io.*;
        import java.util.*;

        public class Main {
            public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st = new StringTokenizer(br.readLine());
                int n = Integer.parseInt(st.nextToken());
                int m = Integer.parseInt(st.nextToken());
                HashMap<Integer, Integer> map1 = new HashMap<>();
                HashMap<Integer, Integer> map2 = new HashMap<>();
                int[] arr1 = new int[n];
                int[] arr2 = new int[m];
                int count =0;
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                for (int i = 0; i < n; i++) {
                    int a = Integer.parseInt(st1.nextToken());
                    map1.put(a, i);
                    arr1[i]=a;
                }
                StringTokenizer st2 = new StringTokenizer(br.readLine());
                for (int i = 0; i < m; i++) {
                    int b = Integer.parseInt(st2.nextToken());
                    map2.put(b, i);
                    arr2[i]=b;
                }
                for (int i:arr2){
                    if(map1.containsKey(i)){
                        count++;
                    }
                }
                for (int i:arr1){
                    if(map2.containsKey(i)){
                        count++;
                    }
                }
                System.out.println(n+m-count);
            }
        }

