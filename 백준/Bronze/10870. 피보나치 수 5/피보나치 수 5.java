import java.io.*;
import java.util.*;

class Main {

    static boolean[] isPrime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long t = Long.parseLong(br.readLine());
        System.out.print(fibo(t));


    }

    static long fibo(long n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }else {
            return fibo(n-1) + fibo(n - 2);
        }
    }


}