import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int k=Integer.parseInt(st.nextToken());
        int[] arr=new int[n];
        StringTokenizer st1= new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i]=Integer.parseInt(st1.nextToken());
        }
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
            if(arr[i]<arr[j]) {
                swap(arr, i, j);
            }
            }
        }
        System.out.println(arr[k-1]);
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}