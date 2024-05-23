import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b=a;
        int i=0;
        int count=0;
        while (a>0) {
            i++;
            a=a-i;
            count+=i;
        }
        a=a+i;
        if(i%2==1) {
            System.out.println((count - b + 1) + "/" + a);
        }
        else if(i%2==0) {
            System.out.println(a + "/" + (count - b + 1));
        }
    }
}