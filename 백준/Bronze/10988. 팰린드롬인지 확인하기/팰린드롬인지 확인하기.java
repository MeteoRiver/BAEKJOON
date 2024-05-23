import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s=br.readLine();
        String a = new StringBuilder(s).reverse().toString();

        if(s.equals(a)){
        System.out.println("1");
        }
        else
        {
        System.out.println("0");
        }
    }
}