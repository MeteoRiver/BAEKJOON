import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");

        int y = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int x = Integer.parseInt(br.readLine());

        d += x;

        while (d > 30) {
            d -= 30;
            m++;
        }

        while (m > 12) {
            m -= 12;
            y++;
        }

        System.out.println(String.format("%04d-%02d-%02d", y, m, d));
    }
}