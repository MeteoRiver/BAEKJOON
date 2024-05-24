    import java.io.*;
    import java.util.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(br.readLine(), i);
            }
            String[] arr = new String[m];
            for (int i = 0; i < m; i++) {
                arr[i] = br.readLine();
            }
            Arrays.sort(arr);
            int count=0;
            StringBuilder sb =  new StringBuilder();
            for(String s : arr){
                if(map.containsKey(s)){
                    sb.append(s+"\n");
                    count++;
                }
            }
            System.out.println(count);
            System.out.println(sb);
        }
    }

