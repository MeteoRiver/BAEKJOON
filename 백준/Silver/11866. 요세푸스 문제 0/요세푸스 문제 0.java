    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.util.*;

    public class Main {

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            Queue<Integer> q = new LinkedList<>();
            for (int i = 1; i <=n; i++) {
                q.add(i);
            }
            System.out.print("<");
            while(!q.isEmpty()) {

                // K-1번 앞에 있는 원소를 뒤로 보낸다.
                for(int i = 0; i < m - 1; i++) {
                    int val = q.poll();
                    q.offer(val);
                }

                System.out.print(q.poll());
                if(q.isEmpty()){break;}
                System.out.print(", ");
                }
            System.out.print(">");
        }
    }