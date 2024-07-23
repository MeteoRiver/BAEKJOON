import java.io.*;
import java.util.LinkedList;
import java.util.Queue;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            q.add(i+1);
        }
        while(q.size()>1){
            q.poll();
            q.offer(q.poll());
        }
        System.out.println(q.poll());
    }
}