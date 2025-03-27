import java.io.*;
import java.util.*;

class Main {

    static boolean[] isPrime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count;
        int t = Integer.parseInt(br.readLine());
        int maxN = 1000000;
        Prime(maxN);

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            count = 0;

            for (int j = 2; j <= n/2; j++) {
                if(isPrime[j]&&isPrime[n-j]) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }


    static void Prime(int n){
        isPrime = new boolean[n + 1];

        for(int i = 0; i < isPrime.length; i++){
            isPrime[i] = true;
        }

        isPrime[0] = isPrime[1] = false;

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(isPrime[i]){
                for(int j = i*i; j<=n; j+=i){
                    isPrime[j] = false;
                }
            }
        }
    }


}