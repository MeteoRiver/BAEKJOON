import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[a];
        int[] term = new int[a-1];
        int min = 0;
        int sum=0;
        for (int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for (int i = 0; i < a-1; i++) {
            term[i] = arr[i+1] - arr[i];
        }

        for (int i = 0; i < a-1; i++) {
            min=gcd(term[i], min);
            if (min==1) {break;}
        }
        for (int i = 0; i < a - 1; i++) {
            sum += term[i] / min - 1;
        }

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
