import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        int count=0;
        if(a-b!=1) {
            count = (v-a) / (a - b);
            if ((v-a) % (a - b) != 0) {
                count++;
            }
            count++;
        }
        if(a-b==1) {
            count=v-a+1;
        }
        System.out.println(count);
    }
}