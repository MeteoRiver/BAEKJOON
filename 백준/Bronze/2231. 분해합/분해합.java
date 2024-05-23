import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int m=0;
        int sum=0;
        int number=0;
        for(int i=0;i<n;i++) {
            number=i;
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
            if(sum+i==n){
                m=i;
                break;
            }
            sum=0;
        }
        System.out.println(m);


    }
}