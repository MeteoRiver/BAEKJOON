import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(b==0){
                System.out.println(a*b/a);
            }
            System.out.println(a * b / x(a, b));
        }

    }
    public static int x( int a, int b){
        if (b == 0) {
            return a;
        } else {
            return x(b, a % b);
        }
    }
}