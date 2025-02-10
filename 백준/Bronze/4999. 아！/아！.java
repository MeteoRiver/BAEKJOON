import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();
        int x = a.length();
        int y = b.length();
        if(x>=y){
            System.out.println("go");
        }
        else{
            System.out.println("no");
        }
    }
}
