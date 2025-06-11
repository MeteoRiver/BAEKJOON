import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        double monster = a - a * ((double)b / 100);

        if (monster < 100){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
        
    }
}
