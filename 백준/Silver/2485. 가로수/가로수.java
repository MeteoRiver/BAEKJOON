import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[a];
        int min = 0;
        int term=0;
        int sum=0;
        for (int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < a-1; i++) {
            if(arr[i]<arr[i+1]) {
                term = arr[i + 1] - arr[i];
                min=gcd(term,min);
            }
            else if(arr[i]>arr[i+1]) {
                term = arr[i] - arr[i+1];
                min=gcd(term,min);
            }
        }
        sum=(arr[a-1]-arr[0])/min+1-a;
        System.out.println(sum);
    }

    public static int gcd(int a, int b) {
        if(b==0){
            return a;
        } else{
            return gcd(b,a%b);
        }
    }
}