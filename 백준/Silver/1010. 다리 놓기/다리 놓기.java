import java.util.*;
import java.io.*;

public class Main {
    public static long combination(int n, int r) {
        if (r > n - r) r = n - r; // nCr == nC(n-r)
        long result = 1;
        for (int i = 1; i <= r; i++) {
            result = result * (n - i + 1) / i;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bf.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            System.out.println(combination(M, N));
        }
    }
}
