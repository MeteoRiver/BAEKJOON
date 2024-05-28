import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        System.out.println(x(n,m));
        System.out.println(n * m / x(n, m));
    }

    public static int x( int a, int b){//최대공약수
        if (b == 0) {
            return a;
        } else {
            return x(b, a % b);
        }
    }

}