import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        Deque<Integer> q= new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            String s = st1.nextToken();
            if(s.equals("push")){
                int x = Integer.parseInt(st1.nextToken());
                q.offer(x);
            }
            else if(s.equals("pop")){
                if(q.isEmpty()){
                    sb.append(-1+"\n");
                }
                else {
                    sb.append(q.poll()+"\n");
                }
            }
            else if(s.equals("size")){
                sb.append(q.size()+"\n");
            }
            else if(s.equals("empty")){
                if(q.isEmpty()){
                    sb.append(1+"\n");
                }
                else {
                    sb.append(0+"\n");
                }
            }
            else if(s.equals("front")){
                if(q.isEmpty()){
                    sb.append(-1+"\n");
                }
                else {
                    sb.append(q.peek()+"\n");
                }
            }
            else if(s.equals("back")){
                if(q.isEmpty()){
                    sb.append(-1+"\n");
                }
                else {
                    sb.append(q.peekLast()+"\n");
                }
            }
        }
        System.out.println(sb);
    }
}
