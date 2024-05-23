import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr=new int[5];
        int sum=0;
        int avg=0;
        for(int i = 0; i < 5; i++) {
            arr[i]=Integer.parseInt(br.readLine());
        }
        for(int i = 0; i < 5; i++) {
            for(int j = i+1; j < 5; j++) {
            if(arr[i]>arr[j]) {
                swap(arr, i, j);
            }
            }
        }
        for(int i = 0; i < 5; i++) {
            sum+=arr[i];
        }
        avg=sum/5;
        System.out.println(avg);
        System.out.println(arr[2]);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}