import java.io.*;
import java.util.*;

class Main {

    static boolean[] isPrime;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count;
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            if(n == 0) break;
            count = 0;
            Prime(2*n);

            for (int i = n+1; i <= 2*n; i++) {
                if (isPrime[i]) {
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