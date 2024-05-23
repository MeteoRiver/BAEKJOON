import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                k--;
            }
            if (k == 0) {
                System.out.print(i);
                break;
            }
        }
        if(k!=0){
            System.out.print(0);
        }
    }
}