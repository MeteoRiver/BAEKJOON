import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());
        int count=0;
        int i=1;
        if(n==1){
            System.out.println("1");
        }
        else {
            while (n > 1) {
                n = n - 6*i;
                i++;
            }

            System.out.println(i);
        }
    }
}
