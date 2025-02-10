import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0) break;  //a, b 둘다 0이면 loop 종료
            if (a > b) {
                sb.append("Yes\n");
            } else {
                sb.append("No\n");
            }
        }
        System.out.print(sb);
    }
}