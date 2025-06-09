import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count = 1;
        int a = n*m;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < a; i++) {
            if((i+1)%m == 0 && i != a-1) {
                sb.append(count++ + "\n");
            }
            else if(i == a-1){
                sb.append(count++);
            }
            else {
                sb.append(count++ + " ");
            }
        }
        System.out.println(sb.toString());
    }
}
