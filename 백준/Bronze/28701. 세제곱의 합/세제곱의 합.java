import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int x=0, y=0, z=0;
        for(int i = 1; i <= a; i++) {
            x+=i;
        }
        System.out.println(x);
        for(int i = 1; i <= a; i++) {
            y+=i;
        }
        System.out.println(y*y);
        for(int i = 1; i <= a; i++) {
            z+=i*i*i;
        }
        System.out.println(z);
    }
}
