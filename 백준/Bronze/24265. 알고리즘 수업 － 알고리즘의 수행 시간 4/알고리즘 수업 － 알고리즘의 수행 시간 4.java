import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long a=Long.parseLong(br.readLine());
        System.out.println(a*(a-1)/2);
        System.out.println("2");
        }
    }