import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int b=0;
        int c=0;
        int a=Integer.parseInt(br.readLine());
        for(int i=0;i<a;i++)
        {
            if(i==0){b=0;}
            b+=(int)Math.pow(2,i);
        }
        System.out.print((int)Math.pow(b+2,2));
    }
}