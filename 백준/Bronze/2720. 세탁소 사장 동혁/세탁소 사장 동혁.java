import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int a = Integer.parseInt(br.readLine());
        int[] m={0,0,0,0};
        for (int i = 0; i < a; i++) {
            int c = Integer.parseInt(br.readLine());
            m[0]=c/25;
            m[1]=(c%25)/10;
            m[2]=((c%25)%10)/5;
            m[3]=((c%25)%10)%5;
            for(int j=0;j<4;j++){
                System.out.print(m[j]+" ");
            }
        }
    }
}